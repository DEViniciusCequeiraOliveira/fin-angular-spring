package com.vinicius.fin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vinicius.fin.repository.UserRepository;
import com.vinicius.fin.security.UserAuth;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {

        return userRepository.findById(Long.valueOf(username))
                .map(user -> new UserAuth(user))
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

    }
}
