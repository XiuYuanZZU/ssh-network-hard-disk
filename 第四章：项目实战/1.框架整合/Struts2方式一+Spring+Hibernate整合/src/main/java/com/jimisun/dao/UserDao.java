package com.jimisun.dao;

import com.jimisun.domain.User;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 15:30 2018-11-19
 * @Modified By:
 */
public interface UserDao {
    public void save(User user);

    public User get(Integer id);
}
