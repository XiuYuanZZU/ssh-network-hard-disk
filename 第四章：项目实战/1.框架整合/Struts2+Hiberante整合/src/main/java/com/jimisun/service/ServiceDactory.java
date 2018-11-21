package com.jimisun.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 09:56 2018-11-19
 * @Modified By:
 */
public class ServiceDactory {
    private Map serviceMap = new HashMap<String, Object>();
    private static ServiceDactory serviceDactory;

    private ServiceDactory() {
        try {
            UserService userService = new UserServiceImpl();
            serviceMap.put("userService", userService);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ServiceDactory getInstance() {
        if (serviceDactory == null) {
            serviceDactory = new ServiceDactory();
        }
        return serviceDactory;
    }

    public Object getService(String serviceId) {
        return serviceMap.get(serviceId);
    }
}
