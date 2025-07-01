package com.adam.user_registration_notification_system.repository;

import com.adam.user_registration_notification_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<Long, User> {
}
