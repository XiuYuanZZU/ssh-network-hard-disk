package com.jimisun.dao;

import com.jimisun.domain.User;
import org.hibernate.Session;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 09:46 2018-11-19
 * @Modified By:
 */
public class UserDaoImpl implements UserDao {


    @Override
    public void save(Session session, User user) {
        session.save(user);

    }

    @Override
    public User get(Session session, Integer id) {
        return session.find(User.class, id);
    }
}
