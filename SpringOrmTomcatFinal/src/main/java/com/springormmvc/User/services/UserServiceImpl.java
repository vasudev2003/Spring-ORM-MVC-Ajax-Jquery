package com.springormmvc.User.services;

import com.springmormmvc.User.entity.User;
import com.springormmvc.User.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
@Override
@Transactional
    public int save(User user) {
        //Business Logic
        return userDao.create(user);
    }

    @Override
    public List<User> getUsers() {
        List<User> users = userDao.findUsers();
        Collections.sort(users);
        return users;
    }

    @Override
    public User getUser(Integer id) {
        return userDao.findUser(id);
    }
}
