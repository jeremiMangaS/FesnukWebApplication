package com.mycompany.fesnukwebapp.controller;

import com.mycompany.fesnukwebapp.dto.UserRegistrationRequest;
import com.mycompany.fesnukwebapp.model.User;
import com.mycompany.fesnukwebapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private final UserService userService;
    
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserRegistrationRequest registrationRequest) {
        User newUser = new User();
        newUser.setUsername(registrationRequest.getUsername());
        newUser.setEmail(registrationRequest.getEmail());
        newUser.setPassword(registrationRequest.getPassword());
        newUser.setBio(registrationRequest.getBio());
        
        User registeredUser = userService.registerNewUser(newUser);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }
}
