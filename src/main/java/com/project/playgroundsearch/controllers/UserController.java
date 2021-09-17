package com.project.playgroundsearch.controllers;

import com.project.playgroundsearch.services.UserServiceImpl;
import com.project.playgroundsearch.services.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    private List<UserModel> getUsers() {
        return userService.getUsers();
    }
}
