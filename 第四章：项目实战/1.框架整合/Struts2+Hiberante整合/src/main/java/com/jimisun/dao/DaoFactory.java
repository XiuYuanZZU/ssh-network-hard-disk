package com.jimisun.dao;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 09:48 2018-11-19
 * @Modified By:
 */
public class DaoFactory {

    private Map daoMap = new HashMap<String, Object>();
    private static DaoFactory daoFactory;

    private DaoFactory() {
        try {
            UserDao userDao = new UserDaoImpl();
            daoMap.put("userDao", userDao);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public Object getDao(String daoId) {
        return daoMap.get(daoId);
    }
}
