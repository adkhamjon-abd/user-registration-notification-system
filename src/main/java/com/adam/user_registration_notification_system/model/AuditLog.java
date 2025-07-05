package com.adam.user_registration_notification_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "audit_log")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String action;
    private LocalDateTime timestamp;

    public AuditLog(User user, String action) {
        this.user = user;
        this.action = action;
    }
    @PrePersist
    public void onCreate(){
        timestamp = LocalDateTime.now();
    }
}
