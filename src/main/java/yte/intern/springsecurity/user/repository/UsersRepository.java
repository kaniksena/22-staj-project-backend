package yte.intern.springsecurity.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yte.intern.springsecurity.user.entity.Users;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users,Long> {
   public List<Users> findByRol(String rol);
}
