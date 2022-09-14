package yte.intern.springsecurity.dersler.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import yte.intern.springsecurity.student.entity.Student;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Getter
@NoArgsConstructor
@Entity
public class CustomCourse  {
    @Id
    private Long dersKodu;
    private String dersAdı;
    private String tanım;
    private String tip;
    private String zaman;
    private String oda;
    private String ogretimGorevlisi;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "ders_id" ,referencedColumnName = "dersKodu")
    private List<Student> students=new ArrayList<>();

    public CustomCourse(Long dersKodu, String dersAdı, String tanım, String tip, String zaman, String oda, String ogretimGorevlisi) {
        this.dersKodu = dersKodu;
        this.dersAdı = dersAdı;
        this.tanım = tanım;
        this.tip = tip;
        this.zaman = zaman;
        this.oda = oda;
        this.ogretimGorevlisi = ogretimGorevlisi;
    }

    public void update(CustomCourse customCourse){

        this.dersAdı=dersAdı;
        this.tanım=tanım;
        this.tip=tip;
        this.zaman=zaman;
        this.oda=oda;
        this.ogretimGorevlisi=ogretimGorevlisi;

    }
}
