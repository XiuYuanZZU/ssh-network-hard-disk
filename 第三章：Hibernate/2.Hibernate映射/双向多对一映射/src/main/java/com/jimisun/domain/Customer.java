package com.jimisun.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 12:46 2018-11-11
 * @Modified By:
 */
public class Customer {
    private Integer id;
    private String name;

    private Set<Order> orders = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
