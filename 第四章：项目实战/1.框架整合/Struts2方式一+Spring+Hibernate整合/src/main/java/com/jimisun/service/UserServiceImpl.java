package com.jimisun.service;

import com.jimisun.dao.UserDao;
import com.jimisun.domain.User;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 14:53 2018-11-19
 * @Modified By:
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User get(Integer id) {
        return userDao.get(id);
    }
}
