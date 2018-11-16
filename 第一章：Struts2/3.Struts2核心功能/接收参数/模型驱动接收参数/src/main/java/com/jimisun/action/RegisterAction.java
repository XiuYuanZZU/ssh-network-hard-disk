package com.jimisun.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 14:46 2018-11-12
 * @Modified By:
 */
@ParentPackage("default")
public class RegisterAction implements ModelDriven<User> {


    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }
    
    @Action(value = "register")
    public void register() {
        System.out.println("username:" + user.getUsername() + "    password:" + user.getPassword());
    }

    @Action(value = "goRegister", results = {
            @Result(name = "register", location = "/WEB-INF/jsp/Register.jsp")
    })
    public String goRegister() {
        return "register";
    }


}
