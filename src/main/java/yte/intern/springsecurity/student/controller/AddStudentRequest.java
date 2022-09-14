package yte.intern.springsecurity.student.controller;

import yte.intern.springsecurity.dersler.entity.CustomCourse;
import yte.intern.springsecurity.student.entity.Student;

import javax.validation.constraints.NotEmpty;

public record AddStudentRequest(
        @NotEmpty
        Long id
) {
    public Student toEntity(){
        return new Student(
               id
        );
    }


}
