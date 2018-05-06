package com.example.retrofit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    @Qualifier("userService")
    UserServiceImpl userService;

    @RequestMapping(path = "/getUser", method = RequestMethod.GET)
    public User getUser() {
        return userService.getUsers();
    }

}
