package ru.edutoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Решение к Заданию 3: Реализуйте метод, который будет принимать переменную пути (например, ID пользователя) и возвращать это значение.
 * <p>
 * Подсказка: Используйте @PathVariable.
 *
 * Пример вызова в командной строке Win: curl -X GET http://localhost:8080/user/123
 * Ожидаемый результат: User ID: 123
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
