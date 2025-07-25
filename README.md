# BlogCraft - Tagging & Categorization Module

This module enables classification of blog posts by topic, domain, or audience.
It is part of the BlogCraft platform designed for collaborative blog creation and SEO management.

## 🌐 Tech Stack
- Java 17
- Spring Boot 3.5.3
- MySQL
- JPA / Hibernate
- Maven

## 🚀 Features
- Tag and category input for blog posts
- REST API for saving and retrieving tag/category data
- Simple HTML frontend (index.html)
- MySQL integration with Hibernate auto DDL

## 🛠️ Running the Project
1. **Start MySQL** (ensure `blogcraft_tagging` DB exists)
2. Update credentials in `application.properties`
3. Run the app using:
   ```bash
   mvn spring-boot:run
