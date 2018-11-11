package com.jimisun;

import com.jimisun.domain.Customer;
import com.jimisun.domain.Order;
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
        Customer customer = new Customer();
        customer.setName("bea");
        Order order = new Order();
        order.setNumber("1333");
        order.setCustomer(customer);
        session.save(order);
        transaction.commit();
        Integer id = order.getId();
        Transaction transaction1 = session.beginTransaction();
        Order order1 = session.get(Order.class, id);
        if (order != null) {
            System.out.println("Customer:" + order.getCustomer().getName());
            System.out.println("OrderNumber:" + order.getNumber());
        }
        transaction1.commit();
        session.close();
    }


}
