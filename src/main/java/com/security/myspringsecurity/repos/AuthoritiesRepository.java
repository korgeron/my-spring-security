package com.security.myspringsecurity.repos;

import com.security.myspringsecurity.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface AuthoritiesRepository extends JpaRepository<Authority, Long> {

}
