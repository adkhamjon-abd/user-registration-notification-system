package com.adam.user_registration_notification_system;

import com.adam.user_registration_notification_system.model.User;
import com.adam.user_registration_notification_system.service.EmailService;
import com.adam.user_registration_notification_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserRegisteredEventListener {

    @Autowired
    private EmailService emailService;

    @EventListener
    public void handleRegisteredUser(UserRegisteredEvent userRegisteredEvent){
        User user = userRegisteredEvent.getUser();
        emailService.sendEmail(user.getName(), user.getEmail());
    }
}
