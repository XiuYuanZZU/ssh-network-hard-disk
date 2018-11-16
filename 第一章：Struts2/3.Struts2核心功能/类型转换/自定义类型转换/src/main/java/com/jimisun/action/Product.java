package com.jimisun.action;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 11:05 2018-11-16
 * @Modified By:
 */
public class Product {
    private String productName;
    private float price;
    private int count;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
