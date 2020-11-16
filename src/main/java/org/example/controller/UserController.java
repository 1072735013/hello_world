package org.example.controller;

import org.example.service.UserService;

public class UserController {

    private static UserService userService = new UserService();



    public void test1() {
        userService.test1();

    }
}
