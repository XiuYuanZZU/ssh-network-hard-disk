package com.jimisun.action;

import com.opensymphony.xwork2.ActionContext;
import com.sun.deploy.net.HttpRequest;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 14:46 2018-11-12
 * @Modified By:
 */
@ParentPackage("default")
public class RegisterAction {


    @Action(value = "goRegister", results = {
            @Result(name = "register", location = "/WEB-INF/jsp/Register.jsp")
    })
    public String goRegister() {
        return "register";
    }

    @Action(value = "register")
    public void register() {
        ActionContext context = ActionContext.getContext();
        HttpServletRequest httpServletRequest = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        System.out.println("username:" + username + "    password:" + password);
    }
}
