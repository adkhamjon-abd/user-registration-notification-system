package com.adam.user_registration_notification_system.repository;

import com.adam.user_registration_notification_system.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoLogRepository extends JpaRepository<AuditLog, Long> {
}
