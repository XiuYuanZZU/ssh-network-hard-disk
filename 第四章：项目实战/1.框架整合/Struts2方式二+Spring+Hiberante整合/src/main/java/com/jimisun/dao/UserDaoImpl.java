package com.jimisun.dao;

import com.jimisun.domain.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 15:30 2018-11-19
 * @Modified By:
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public void save(User user) {
        this.getHibernateTemplate().save(user);
    }

    @Override
    public User get(Integer id) {
        return this.getHibernateTemplate().get(User.class, id);
    }
}
