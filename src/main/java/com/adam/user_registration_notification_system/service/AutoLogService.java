package com.adam.user_registration_notification_system.service;

import org.springframework.stereotype.Service;

@Service
public class AutoLogService {

    public void log(Long userId, String action){
        System.out.println("The user with ID: " + userId + " was " + action + " Registered");
    }
}
