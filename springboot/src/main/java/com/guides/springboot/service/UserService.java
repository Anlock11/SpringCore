package com.guides.springboot.service;

import com.guides.springboot.entity.Users;

import java.util.List;

public interface UserService {
    Users createUser(Users users);
    Users getUserById(Long userId);
    List <Users> getAllUsers();

    Users updateUsers(Users users);
    void deleteUser(Long userId);
}
