package com.jimisun.action;

import com.jimisun.domain.User;
import com.jimisun.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 14:48 2018-11-19
 * @Modified By:
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Action(value = "getUser", results = {
            @Result(name = "success", location = "/index.jsp")
    })
    public String get() throws Exception {
        User user = userService.get(this.user.getId());
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("user", user);
        return SUCCESS;
    }

    @Action(value = "addUser", results = {
            @Result(name = "success", location = "/index.jsp")
    })
    public String add() throws Exception {
        userService.save(user);
        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }
}
