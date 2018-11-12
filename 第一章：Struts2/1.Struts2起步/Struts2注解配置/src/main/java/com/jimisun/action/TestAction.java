package com.jimisun.action;

import org.apache.struts2.convention.annotation.*;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 16:04 2018-11-11
 * @Modified By:
 */
@ParentPackage("struts-default")
@Namespace("/test")
public class TestAction {

    @Action(value = "hello", results = {
            @Result(name = "hello", location = "/WEB-INF/jsp/hello.jsp")
    })
    public String hello() throws Exception {
        return "hello";
    }
}
