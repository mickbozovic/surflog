package com.techo.sl.userservice.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.techo.sl.userservice.User;
import com.techo.sl.userservice.UserService;

@Component
public class UserDataLoader implements ApplicationRunner {

    private UserService userService;

    @Autowired
    public UserDataLoader(UserService bookService) {
        this.userService = bookService;
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        this.userService.createUser(new User("Jonh", "Q"));
        this.userService.createUser(new User("Maven", "W"));
    }
}
