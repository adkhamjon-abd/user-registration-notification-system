package com.adam.user_registration_notification_system.controller;

import com.adam.user_registration_notification_system.service.UserService;
import com.adam.user_registration_notification_system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<User> register(@RequestBody User user){
        if (user == null){
            return ResponseEntity.badRequest().build();
        }
        System.out.println("Controller accepted");
        User registeredUser = userService.register(user);
        System.out.println("User returned" + registeredUser);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }
}
