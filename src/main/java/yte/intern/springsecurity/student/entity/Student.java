package yte.intern.springsecurity.student.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import yte.intern.springsecurity.user.entity.Users;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Student {
    @Id
    private Long id;



    public Student(Long id) {
        this.id = id;
    }

}
