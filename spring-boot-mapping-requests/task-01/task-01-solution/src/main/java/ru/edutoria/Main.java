package ru.edutoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Решение задания 1: Создайте контроллер с методом, который принимает GET-запрос и возвращает персонализированное приветствие
 * в зависимости от параметра name.
 * <p>
 * Подсказка: Используйте @RequestParam.
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
    