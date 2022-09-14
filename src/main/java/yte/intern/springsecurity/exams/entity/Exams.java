package yte.intern.springsecurity.exams.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor
public class Exams {

    @Id
    private Long id;
    private String time;
    private String dersKodu;
    private Long score;

    public Exams(Long id, String time, String dersKodu, Long score) {
        this.id = id;
        this.time = time;
        this.dersKodu = dersKodu;
        this.score = score;
    }
}
