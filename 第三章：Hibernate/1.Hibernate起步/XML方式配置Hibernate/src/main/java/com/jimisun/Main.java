package com.jimisun;

import com.jimisun.domain.User;
import com.jimisun.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 11:35 2018-11-09
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        Session session = HibernateSessionFactory.getSession();
        Transaction transaction = session.beginTransaction();
        User user = new User();
        user.setUsername("jimisun");
        user.setPassword("jimisun");
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
    }
}
