package com.jimisun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 10:43 2018-11-16
 * @Modified By:
 */
public class ProductAction extends ActionSupport {

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    @Action(value = "register", results = {
            @Result(name = SUCCESS, location = "/success.jsp")
    })
    public String execute() throws Exception {
        System.out.println(product.toString());
        return SUCCESS;
    }
}
