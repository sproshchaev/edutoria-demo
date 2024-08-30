package ru.edutoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Решение задания 2: Создайте контроллер, который принимает POST-запрос с данными пользователя в формате JSON
 * и возвращает его возраст.
 * <p>
 * Подсказка: Используйте @RequestBody.
 * <p>
 * Пример вызова в командной строке Win: curl -X POST http://localhost:8080/users/age -H "Content-Type: application/json" -d "{\"id\": 1, \"firstName\": \"John\", \"lastName\": \"Doe\", \"age\": 25}"
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

