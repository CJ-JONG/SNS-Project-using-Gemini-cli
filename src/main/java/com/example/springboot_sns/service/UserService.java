package com.example.springboot_sns.service;

import com.example.springboot_sns.domain.User;
import com.example.springboot_sns.repository.UserRepository;
import com.example.springboot_sns.dto.UserRegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User registerUser(UserRegisterRequest request) {
        // Check if username already exists
        Optional<User> existingUser = userRepository.findByUsername(request.getUsername());
        if (existingUser.isPresent()) {
            throw new IllegalArgumentException("Username already exists");
        }

        // Encode password and create new user
        String encodedPassword = passwordEncoder.encode(request.getPassword());
        User newUser = new User(request.getUsername(), encodedPassword);
        return userRepository.save(newUser);
    }
}
