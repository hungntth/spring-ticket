package com.example.demo.service;

import com.example.demo.entity.user.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserEntity createUser(UserEntity user);

    Page<UserEntity> getUsers(Pageable pageable);

    Page<UserEntity> findByUserName(String name, Pageable pageable);

    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    List<UserEntity> getAllUsers();

    UserEntity getUserById(Long id);

    // get all by limit offset


    // get search by limit offset
}
