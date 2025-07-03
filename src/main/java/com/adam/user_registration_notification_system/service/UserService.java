package com.adam.user_registration_notification_system.service;

import com.adam.user_registration_notification_system.UserRegisteredEvent;
import com.adam.user_registration_notification_system.model.User;
import com.adam.user_registration_notification_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private ApplicationEventPublisher eventPublisher;
    public User register(User user){
        System.out.println("service accepted");
        eventPublisher.publishEvent(new UserRegisteredEvent(this, user));
        return userRepository.save(user);
    }
}
