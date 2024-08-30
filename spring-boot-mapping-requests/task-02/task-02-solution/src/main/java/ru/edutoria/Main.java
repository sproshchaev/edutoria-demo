package ru.edutoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * task-02-solution
 * Win: curl -X POST http://localhost:8080/users/age -H "Content-Type: application/json" -d "{\"id\": 1, \"firstName\": \"John\", \"lastName\": \"Doe\", \"age\": 25}"
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

