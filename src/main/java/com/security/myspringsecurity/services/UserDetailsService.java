package com.security.myspringsecurity.services;

import com.security.myspringsecurity.models.User;
import com.security.myspringsecurity.models.UserWithRole;
import com.security.myspringsecurity.repos.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    private final UserRepository ur;
    public UserDetailsService(UserRepository userRepository){
        this.ur = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        System.out.println(username);
        User user = ur.findByUsername(username);
        System.out.println(user);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("The username --> %s <-- was not found", username));
        } else {
            return new UserWithRole(user);
        }
    }

}
