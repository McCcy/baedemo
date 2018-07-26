package com.kirito.demo.service.impl;

import com.kirito.demo.dao.UserDao;
import com.kirito.demo.entity.UserDO;
import com.kirito.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserDO> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public UserDO findUser(String username, String password) {
        return userDao.findUser(username, password);
    }

    @Override
    public void addUser(UserDO user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(UserDO user) {
        userDao.updateUser(user);
    }
}
