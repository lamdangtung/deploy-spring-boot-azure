package com.example.deployspringbootazure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping()
    ResponseEntity<?> insertUser(@RequestBody AppUser newAppUser){
        System.out.println(newAppUser.getUsername());
        return ResponseEntity.ok(userRepository.save(newAppUser));
    }

    @GetMapping("/{id}")
    ResponseEntity<?> getUSerById(@PathVariable Long id){
        return ResponseEntity.ok("User");
    }

    @GetMapping("")
    ResponseEntity<?> getAllUSer(){
        return ResponseEntity.ok(userRepository.findAll());
    }

}
