package ru.edutoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Задание 2: Создайте контроллер, который принимает POST-запрос с данными пользователя в формате JSON и возвращает
 * его возраст.
 * <p>
 * Подсказка: Используйте @RequestBody.
 */
// TODO: Установите необходимую аннотацию для класса
public class Main {
    public static void main(String[] args) {
        // TODO: Задайте ключевую команду для запуска приложения Spring Boot

        // TODO: Настройте правильно в пакете controller класс UserController

        // TODO: Запустите приложение и попробуйте выполнить в командной строке Win:
        //  curl -X POST http://localhost:8080/users/age -H "Content-Type: application/json" -d "{\"id\": 1, \"firstName\": \"John\", \"lastName\": \"Doe\", \"age\": 25}"
        //  Должен вернуться ответ: 25

    }
}
