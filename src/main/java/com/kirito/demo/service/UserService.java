package com.kirito.demo.service;

import com.kirito.demo.entity.UserDO;

import java.util.List;

public interface UserService {
    List<UserDO> getUsers();

    UserDO findUser(String username, String password);

    void addUser(UserDO user);

    void updateUser(UserDO user);
}
