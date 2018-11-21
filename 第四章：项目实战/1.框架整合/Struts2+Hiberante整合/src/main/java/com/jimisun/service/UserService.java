package com.jimisun.service;

import com.jimisun.domain.User;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 09:45 2018-11-19
 * @Modified By:
 */
public interface UserService {


    public void save(User user);

    public User get(Integer id);
}
