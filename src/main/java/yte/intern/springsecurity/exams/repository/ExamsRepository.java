package yte.intern.springsecurity.exams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yte.intern.springsecurity.exams.entity.Exams;

public interface ExamsRepository extends JpaRepository<Exams,Long> {
}
