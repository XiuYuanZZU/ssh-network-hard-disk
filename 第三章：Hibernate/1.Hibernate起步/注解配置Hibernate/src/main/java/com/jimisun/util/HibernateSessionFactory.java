package com.jimisun.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.InputStream;
import java.util.Properties;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 18:01 2018-11-08
 * @Modified By:
 */
public class HibernateSessionFactory {

    private static String CONFIG_FILE_LOCATION = "hibernate.cfg.xml";

    private static final ThreadLocal<Session> SESSION_THREAD_LOCAL = new ThreadLocal<>();

    private static Configuration configuration = new Configuration();

    private static SessionFactory sessionFactory;

    private static String configFile = CONFIG_FILE_LOCATION;


    static {
        try {
            configuration.configure(CONFIG_FILE_LOCATION);
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private HibernateSessionFactory() {

    }

    public static Session getSession() throws HibernateException {
        Session session = SESSION_THREAD_LOCAL.get();
        if (session == null || !session.isOpen()) {
            if (sessionFactory == null) {
                System.out.println("sessionFactory为null");
            }
            session = (sessionFactory != null) ? sessionFactory.openSession() : null;
            SESSION_THREAD_LOCAL.set(session);
        }
        return session;
    }

    public static void closeSession() throws HibernateException {
        Session session = SESSION_THREAD_LOCAL.get();
        SESSION_THREAD_LOCAL.set(null);
        if (session != null) {
            session.close();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void setConfigFile(String configFile) {
        HibernateSessionFactory.configFile = configFile;
        sessionFactory = null;
    }

    public static Configuration getConfiguration() {
        return configuration;
    }


}
