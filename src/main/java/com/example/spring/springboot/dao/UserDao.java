package com.example.spring.springboot.dao;

import com.example.spring.springboot.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void updateUser(User updateUser);

    void removeUserById(int id);

    List<User> getAllUsers();

    User getUserById(int id);
}
