package yte.intern.springsecurity.student.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yte.intern.springsecurity.common.MessageResponse;
import yte.intern.springsecurity.common.ResultType;
import yte.intern.springsecurity.dersler.entity.CustomCourse;
import yte.intern.springsecurity.dersler.repository.CourseRepositroy;
import yte.intern.springsecurity.student.StudentRepository;
import yte.intern.springsecurity.student.entity.Student;
import yte.intern.springsecurity.user.entity.Users;
import yte.intern.springsecurity.user.repository.UsersRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final CourseRepositroy courseRepositroy;
    private final UsersRepository usersRepository;

    public MessageResponse registerCourse(Student student) {

        studentRepository.save(student);
        return new MessageResponse("Course has been addedd successfully", ResultType.SUCCESS);

    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }


}
