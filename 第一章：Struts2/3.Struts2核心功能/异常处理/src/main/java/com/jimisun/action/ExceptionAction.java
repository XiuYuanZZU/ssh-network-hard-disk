package com.jimisun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.sql.SQLException;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 13:18 2018-11-16
 * @Modified By:
 */
@ParentPackage("default")
public class ExceptionAction extends ActionSupport {


    @Override
    @Action(value = "testerror", results = {
            @Result(name = SUCCESS, location = "/success.jsp")
    })
    public String execute() throws Exception {
        if ("a".equals("a")) {
            throw new SQLException("SQL错误!!!");
        }
        return SUCCESS;
    }
}
