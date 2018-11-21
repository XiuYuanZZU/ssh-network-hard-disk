package com.jimisun.action;

import com.jimisun.domain.User;
import com.jimisun.service.ServiceDactory;
import com.jimisun.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 09:45 2018-11-19
 * @Modified By:
 */
public class UserAction extends ActionSupport {

    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    @Action(value = "addUser", results = {
            @Result(name = SUCCESS, location = "/index.jsp")
    })
    public String execute() throws Exception {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        UserService userService = (UserService) ServiceDactory.getInstance().getService("userService");
        userService.save(user);
        return SUCCESS;
    }

    @Action(value = "getUser", results = {
            @Result(name = SUCCESS, location = "/index.jsp")
    })
    public String getUser() throws Exception {
        UserService userService = (UserService) ServiceDactory.getInstance().getService("userService");
        User user = userService.get(id);
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("user", user);
        return SUCCESS;
    }
}
