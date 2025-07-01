package com.adam.user_registration_notification_system;

import com.adam.user_registration_notification_system.model.User;
import com.adam.user_registration_notification_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User register(User user){
        System.out.println("service accepted");
        return userRepository.save(user);
    }
}
