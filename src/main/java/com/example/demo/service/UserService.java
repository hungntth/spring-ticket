package com.example.demo.service;

import com.example.demo.entity.user.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserEntity createUser(UserEntity user);

    List<UserEntity> getUsers();


    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    List<UserEntity> getAllUsers();

    UserEntity getUserById(Long id);
}
