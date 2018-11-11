package com.jimisun.domain;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 11:09 2018-11-10
 * @Modified By:
 */
public class Product {

    private Integer id;

    private String name;

    private ProductDetail productDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }
}
