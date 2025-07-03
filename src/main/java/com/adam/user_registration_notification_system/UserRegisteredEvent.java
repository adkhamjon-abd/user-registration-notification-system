package com.adam.user_registration_notification_system;

import com.adam.user_registration_notification_system.model.User;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ApplicationContextEvent;

@Getter
public class UserRegisteredEvent extends ApplicationEvent {


    private User user;
    public UserRegisteredEvent(Object source, User user){
        super(source);
        this.user = user;

    }
}
