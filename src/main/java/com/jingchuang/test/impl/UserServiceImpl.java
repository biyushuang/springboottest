package com.jingchuang.test.impl;

import com.jingchuang.test.dao.UserDao;
import com.jingchuang.test.entiy.User;
import com.jingchuang.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userdao;

    @Override
    public List<User> getUsers() {
        List<User> users = userdao.getUsers();
        return users;
    }
}
