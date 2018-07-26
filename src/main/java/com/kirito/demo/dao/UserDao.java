package com.kirito.demo.dao;

import com.kirito.demo.entity.UserDO;

import java.util.List;

public interface UserDao {
    List<UserDO> getUsers();

    UserDO findUser(String username, String password);

    void addUser(UserDO user);

    void updateUser(UserDO user);
}
