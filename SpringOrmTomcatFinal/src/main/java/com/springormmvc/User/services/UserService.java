package com.springormmvc.User.services;

import com.springmormmvc.User.entity.User;

import java.util.List;

public interface UserService {
    int save(User user);
    List<User>getUsers();
    User getUser(Integer id);
}
