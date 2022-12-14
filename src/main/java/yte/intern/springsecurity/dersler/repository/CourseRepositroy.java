package yte.intern.springsecurity.dersler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yte.intern.springsecurity.dersler.entity.CustomCourse;

import java.util.List;

public interface CourseRepositroy extends JpaRepository<CustomCourse,Long> {
    public List<CustomCourse> findByDersAdÄ±(String dersAdÄ±);
    public List<CustomCourse> findByTip(String tip);
}
