package com.example.demo.service;

import com.example.demo.entity.user.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity createUser(UserEntity user);

    List<UserEntity> getUsers();


}
