package ru.edutoria.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.edutoria.domain.User;

@RestController
public class UserController {

    @PostMapping("/users/age")
    public int getUserAge(@RequestBody User user) {
        return user.getAge();
    }

}
