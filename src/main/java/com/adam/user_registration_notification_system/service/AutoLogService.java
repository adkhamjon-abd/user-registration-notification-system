package com.adam.user_registration_notification_system.service;

import com.adam.user_registration_notification_system.model.AuditLog;
import com.adam.user_registration_notification_system.model.User;
import com.adam.user_registration_notification_system.repository.AutoLogRepository;
import com.adam.user_registration_notification_system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoLogService {

    @Autowired
    AutoLogRepository autoLogRepository;
    @Autowired
    UserRepository userRepository;
    public void log(Long userId, String action){
        System.out.println("The user with ID: " + userId + " was " + action + " Registered");
        User user = userRepository.getReferenceById(userId);
        AuditLog auditLog = new AuditLog(user, "Registered");
        AuditLog auditLogSaved = autoLogRepository.save(auditLog);
        if (auditLogSaved.getId() == null){
            System.out.println("Failed to save the file");
        }
    }
}
