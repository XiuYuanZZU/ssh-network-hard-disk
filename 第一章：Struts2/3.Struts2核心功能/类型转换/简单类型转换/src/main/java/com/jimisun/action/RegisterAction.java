package com.jimisun.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 10:43 2018-11-16
 * @Modified By:
 */
public class RegisterAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }
    @Override
    @Action(value = "register", results = {
            @Result(name = SUCCESS, location = "/success.jsp")
    })
    public String execute() throws Exception {
        System.out.println(user.toString());
        return SUCCESS;
    }
}
