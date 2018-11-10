package com.jimisun;

import com.jimisun.domain.User;
import com.jimisun.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 11:35 2018-11-09
 * @Modified By:
 */
public class Main {

    static Session session = HibernateSessionFactory.getSession();


    /**
     * 保存&更新User
     */
    static void addUser() {
        Transaction transaction = session.beginTransaction();
        User user = new User();
        user.setUsername("jimisunl");
        user.setPassword("jimisun");
        session.saveOrUpdate(user);
        transaction.commit();
    }

    /**
     * 查找User
     *
     * @param theClass
     * @param id
     * @return
     */
    static User getUser(Class theClass, Serializable id) {
        return (User) session.find(theClass, id);
    }


    /**
     * 删除User
     * @param object
     */
    static void deleteUser(Object object) {
        Transaction transaction = session.beginTransaction();
        session.delete(object);
        transaction.commit();
    }


    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        deleteUser(user);
    }
}
