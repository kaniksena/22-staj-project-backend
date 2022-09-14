package yte.intern.springsecurity.user.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yte.intern.springsecurity.common.MessageResponse;
import yte.intern.springsecurity.common.ResultType;
import yte.intern.springsecurity.user.entity.Users;
import yte.intern.springsecurity.user.repository.UsersRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {
    private  final UsersRepository usersRepository;

    public MessageResponse AddUser(Users users) {
        usersRepository.save(users);
        return new MessageResponse("User has been added successfully", ResultType.SUCCESS);

    }

    public List<Users> getAllUser() {

        return usersRepository.findAll();
    }

    public List<Users> getByRol(String rol) {

        return usersRepository.findByRol(rol);
    }


    public Users getById(Long id) {

        return (Users) usersRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("hata"));
    }

    public MessageResponse deleteUser(Long id) {
        usersRepository.deleteById(id);
        return new MessageResponse("Student with id %d has been deleted", ResultType.SUCCESS);
    }


}
