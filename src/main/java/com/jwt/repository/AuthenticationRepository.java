package com.jwt.repository;

import com.jwt.model.JwtRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationRepository extends JpaRepository<JwtRequest, Integer> {


    JwtRequest findByUsername(String username);


}
