package com.security.myspringsecurity.repos;

import com.security.myspringsecurity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   @Query(value = "SELECT u FROM User u WHERE u.username = :username")
   User findByUsername(String username);
}
