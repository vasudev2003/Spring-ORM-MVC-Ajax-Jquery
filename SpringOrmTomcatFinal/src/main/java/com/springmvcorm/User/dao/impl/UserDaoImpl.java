package com.springmvcorm.User.dao.impl;

import com.springmormmvc.User.entity.User;
import com.springormmvc.User.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    HibernateTemplate hibernateTemplate;
@Override
    public int create(User user) {
        Integer result = (Integer) hibernateTemplate.save(user);

        return result;
    }

    @Override
    public List<User> findUsers() {
        return hibernateTemplate.loadAll(User.class);

    }

    @Override
    public User findUser(Integer id) {
        return hibernateTemplate.get( User.class,id) ;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}



