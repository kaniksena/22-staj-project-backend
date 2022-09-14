package yte.intern.springsecurity.student;

import org.springframework.data.jpa.repository.JpaRepository;
import yte.intern.springsecurity.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
