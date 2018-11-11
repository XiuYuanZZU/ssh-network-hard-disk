package com.jimisun;

import com.jimisun.domain.Customer;
import com.jimisun.domain.Order;
import com.jimisun.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Set;

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
        Customer customer = session.get(Customer.class, 1);
        Set<Order> orders = customer.getOrders();
        for (Order order : orders) {
            System.out.println(order.getNumber());
        }
        transaction.commit();
        session.close();
    }


}
