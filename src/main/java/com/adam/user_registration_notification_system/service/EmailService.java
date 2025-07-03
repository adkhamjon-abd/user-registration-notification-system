package com.adam.user_registration_notification_system.service;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendEmail(String name, String email){
        System.out.println("Email sent to the user: " + name + " with email address: " + email);
    }
}
