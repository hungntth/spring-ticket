package com.example.demo.controller.user;


import com.example.demo.entity.user.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

    @GetMapping("/search")
    public UserEntity getUserBy(@RequestParam String name, @RequestParam String email) {
        return userService.findByUserNameAndUserEmail(name, email);
    }
}
