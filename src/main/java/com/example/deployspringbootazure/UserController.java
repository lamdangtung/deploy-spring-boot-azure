package com.example.deployspringbootazure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping()
    ResponseEntity<?> insertUser(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping("/{id}")
    ResponseEntity<?> getUSerById(@PathVariable Long id){
        return ResponseEntity.ok("User");
    }
}
