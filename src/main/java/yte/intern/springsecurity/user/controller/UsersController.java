package yte.intern.springsecurity.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yte.intern.springsecurity.common.MessageResponse;
import yte.intern.springsecurity.user.service.UserService;

import javax.validation.Valid;
import java.util.List;
@Controller
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {
   private final UserService userService;

    @PostMapping
    public MessageResponse addUser(@RequestBody @Valid AddUserController request) {
        return userService.AddUser(request.toEntity());
    }

    @GetMapping
    public List<UserResponse> getAllUser(){
        return userService.getAllUser()
                .stream()
                .map(UserResponse::fromEntity)
                .toList();

    }
    @GetMapping("/rol/{rol}")
    public List<UserResponse> getUserByRol(@PathVariable String rol) {
        return userService.getByRol(rol)
                .stream()
                .map(UserResponse::fromEntity)
                .toList();
    }

    @GetMapping("/{id}")
    public UserResponse getStudentById(@PathVariable Long id) {
        return UserResponse.fromEntity(userService.getById(id));
    }

    @DeleteMapping("/{id}")
    public MessageResponse deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
