package com.axs.core.service;

import com.axs.core.bean.User;
import com.axs.core.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(Integer id) {

        return userDao.getUserById(id);
    }
}
