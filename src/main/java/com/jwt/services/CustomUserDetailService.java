package com.jwt.services;

import com.jwt.model.JwtRequest;
import com.jwt.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private AuthenticationRepository authenticationRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        JwtRequest jwtRequest = authenticationRepository.findByUsername(username);

        return new User(jwtRequest.getUsername(),jwtRequest.getPassword(),new ArrayList<>());

    }
}
