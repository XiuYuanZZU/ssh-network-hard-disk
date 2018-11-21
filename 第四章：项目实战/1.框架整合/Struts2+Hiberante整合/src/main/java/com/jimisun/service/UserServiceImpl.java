package com.jimisun.service;


import com.jimisun.dao.DaoFactory;
import com.jimisun.dao.HibernateSessionFactory;
import com.jimisun.dao.UserDao;
import com.jimisun.domain.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 09:46 2018-11-19
 * @Modified By:
 */
public class UserServiceImpl implements UserService {

    @Override
    public void save(User user) {
        UserDao userDao = (UserDao) DaoFactory.getInstance().getDao("userDao");
        Session session = HibernateSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        userDao.save(session, user);
        transaction.commit();
    }

    @Override
    public User get(Integer id) {
        UserDao userDao = (UserDao) DaoFactory.getInstance().getDao("userDao");
        Session session = HibernateSessionFactory.getSession();
        User user = userDao.get(session, id);
        return user;
    }
}
