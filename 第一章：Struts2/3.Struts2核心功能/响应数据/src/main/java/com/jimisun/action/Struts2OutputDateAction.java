package com.jimisun.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 12:17 2018-11-16
 * @Modified By:
 */
public class Struts2OutputDateAction extends ActionSupport {

    private User user = new User("jimisun", "jimisun");
    private List<User> list = new ArrayList<>();


    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    @Action(value = "outputdate", results = {
            @Result(name = SUCCESS, location = "/success.jsp")
    })
    public String execute() throws Exception {
        User user1 = new User("list1","list1");
        User user2 = new User("list2","list2");
        list.add(user1);
        list.add(user2);

        ActionContext context = ActionContext.getContext();
        HttpServletRequest request  = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);
        request.setAttribute("requestValue","requestValue");


        ValueStack valueStack = context.getValueStack();
        valueStack.set("valueStackDemo", "valueStackDemoSet");
        valueStack.push("valueStackPush");
        return SUCCESS;

    }
}
