package com.jimisun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 14:09 2018-11-16
 * @Modified By:
 */
public class BeautifulGirlAction extends ActionSupport {

    private String username;
    private String content;
    private String welcome;

    @Override
    @Action(value = "girl", results = {
            @Result(name = SUCCESS, location = "/success.jsp")
    })
    public String execute() throws Exception {
        welcome = getText("welcome", new String[]{username});
        content = getText("content");
        return SUCCESS;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }


}
