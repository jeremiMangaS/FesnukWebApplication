package com.mycompany.fesnukwebapp.service.impl;

import com.mycompany.fesnukwebapp.model.Role;
import com.mycompany.fesnukwebapp.model.User;
import com.mycompany.fesnukwebapp.repository.UserRepository;
import com.mycompany.fesnukwebapp.service.UserService;
import java.time.OffsetDateTime;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    
    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    
    @Override
    public User registerNewUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        
        if (user.getRole() == null) {
            user.setRole(Role.USER);
        }
        
        user.setCreatedAt(OffsetDateTime.now());
        user.setUpdatedAt(OffsetDateTime.now());
        
        return userRepository.save(user);
    }
}
