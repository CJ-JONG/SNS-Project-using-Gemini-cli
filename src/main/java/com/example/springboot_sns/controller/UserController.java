package com.example.springboot_sns.controller;

import com.example.springboot_sns.domain.User;
import com.example.springboot_sns.dto.UserRegisterRequest;
import com.example.springboot_sns.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody UserRegisterRequest request) {
        try {
            User newUser = userService.registerUser(request);
            // In a real application, you might return a DTO with less sensitive information
            return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build(); // Username already exists
        }
    }
}
