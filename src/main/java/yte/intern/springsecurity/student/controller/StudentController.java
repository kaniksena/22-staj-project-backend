package yte.intern.springsecurity.student.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yte.intern.springsecurity.common.MessageResponse;
import yte.intern.springsecurity.dersler.controller.AddCourseRequest;
import yte.intern.springsecurity.student.service.StudentService;
import yte.intern.springsecurity.user.controller.AddUserController;

import javax.validation.Valid;
@RestController
@RequestMapping("/register")
@RequiredArgsConstructor
public class StudentController {
private final StudentService studentService;
    @PostMapping
    public MessageResponse registerCourse(@RequestBody @Valid AddStudentRequest request ){
        return studentService.registerCourse(request.toEntity());
    }
}
