package yte.intern.springsecurity.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import yte.intern.springsecurity.dersler.entity.CustomCourse;
import yte.intern.springsecurity.student.entity.Student;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor

public class Users {
    @Id
    private Long id;
    private String name;
    private String surname;
    private String rol;
    private String email;
    private String kullanıcıAdı;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "student_id" ,referencedColumnName = "id")
    private List<Student> students=new ArrayList<>();

    public Users(Long id, String name, String surname, String rol, String email, String kullanıcıAdı) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.rol = rol;
        this.email = email;
        this.kullanıcıAdı = kullanıcıAdı;
    }
}
