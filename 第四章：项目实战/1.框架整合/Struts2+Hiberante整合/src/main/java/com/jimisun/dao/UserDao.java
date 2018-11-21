package com.jimisun.dao;

import com.jimisun.domain.User;
import org.hibernate.Session;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 09:37 2018-11-19
 * @Modified By:
 */
public interface UserDao {

    public void save(Session session, User user);

    public User get(Session session, Integer id);
}
