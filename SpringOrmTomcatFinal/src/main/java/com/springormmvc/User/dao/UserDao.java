package com.springormmvc.User.dao;

import com.springmormmvc.User.entity.User;

import java.util.List;

public interface UserDao {
    int create(User user);
    List<User> findUsers();
    User findUser(Integer id);
}
