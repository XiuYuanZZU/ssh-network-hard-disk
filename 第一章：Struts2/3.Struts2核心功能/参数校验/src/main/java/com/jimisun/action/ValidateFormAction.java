package com.jimisun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 09:21 2018-11-16
 * @Modified By:
 */
public class ValidateFormAction extends ActionSupport {
    private String username;
    private String password;

    @Override
    @Action(value = "register", results = {
            @Result(name = SUCCESS, location = "/success.jsp"),
            @Result(name = INPUT,location = "/form.jsp")
    })
    public String execute() throws Exception {
        System.out.println("username"+username+"password:"+password);
        return SUCCESS;
    }

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
}
