package com.jimisun.action;

import java.util.Arrays;
import java.util.Date;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 10:33 2018-11-16
 * @Modified By:
 */
public class User {
    private String username;
    private String password;
    private Date birthday;
    private Integer age;
    private String [] address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", address=" + Arrays.toString(address) +
                '}';
    }
}
