# 📬 User Registration Notification System

A simple Spring Boot project that demonstrates the use of **custom events** for decoupled logic execution — such as sending welcome emails and audit logging on user registration.

---

## 🚀 Features

- User registration via REST API
- Event publishing using Spring's `ApplicationEventPublisher`
- Event listeners for:
  - Sending welcome emails
  - Storing audit logs
- In-memory H2 database with web console

---

## 📁 Project Structure

src/
├── main/

│ ├── java/

│ │ └── com/example/

│ │ ├── controller/ # REST controller for user registration

│ │ ├── event/ # Custom event class

│ │ ├── listener/ # Event listeners

│ │ ├── model/ # User & AuditLog entities

│ │ ├── repository/ # JPA repositories

│ │ └── service/ # Business logic

│ └── resources/

│ └── application.properties


---

## 🛠️ How to Run

1. Clone the repository:
git clone https://github.com/your-username/project-name.git

markdown
Copy
Edit

2. Open in your IDE (e.g., IntelliJ, VS Code)

3. Run the `main` application class:
UserNotificationApplication.java

yaml
Copy
Edit

4. Access H2 Console (for DB inspection):
- Go to: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: *(leave blank)*

---

## 📬 API Endpoint

| Method | Endpoint      | Description            |
|--------|---------------|------------------------|
| POST   | `/register`   | Registers a new user   |

---

## 📚 Technologies Used

- Java 21
- Spring Boot
- H2 Database
- Spring Events (`@EventListener`, `ApplicationEventPublisher`)

---

## ✍️ Author

Your Name – [your.email@example.com](mailto:your.email@example.com)

---
