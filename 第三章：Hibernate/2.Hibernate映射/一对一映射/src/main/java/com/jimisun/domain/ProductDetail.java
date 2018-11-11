package com.jimisun.domain;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 11:09 2018-11-10
 * @Modified By:
 */

public class ProductDetail {

    private Integer id;

    private String detatil;

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProducts() {
        return product;
    }

    public void setProducts(Product products) {
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetatil() {
        return detatil;
    }

    public void setDetatil(String detatil) {
        this.detatil = detatil;
    }
}
