package com.jimisun.domain;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 12:45 2018-11-11
 * @Modified By:
 */
public class Order {
    private Integer id;
    private String number;
    private Customer customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
