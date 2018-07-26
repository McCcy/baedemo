package com.kirito.demo.dao.impl;

import com.kirito.demo.dao.UserDao;
import com.kirito.demo.dao.UserMapper;
import com.kirito.demo.entity.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDO> getUsers() {
        return userMapper.getUsers();
    }

    @Override
    public UserDO findUser(String username, String password) {
        return userMapper.findUser(username, password);
    }

    @Override
    public void addUser(UserDO user) {
        userMapper.addUser(user);
    }

    @Override
    public void updateUser(UserDO user) {
        userMapper.updateUser(user);
    }
}
