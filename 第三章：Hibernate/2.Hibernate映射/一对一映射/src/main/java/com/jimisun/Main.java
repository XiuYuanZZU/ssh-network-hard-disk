package com.jimisun;

import com.jimisun.domain.Product;
import com.jimisun.domain.ProductDetail;
import com.jimisun.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 11:35 2018-11-09
 * @Modified By:
 */
public class Main {

    static Session session = HibernateSessionFactory.getSession();

    static void addProduct() {
        Transaction transaction = session.beginTransaction();
        Product product = new Product();
        ProductDetail productDetail = new ProductDetail();
        product.setName("中药");
        productDetail.setDetatil("中药非常号");
        product.setProductDetail(productDetail);
        productDetail.setProduct(product);
        session.saveOrUpdate(product);
        transaction.commit();
    }

    public static void main(String[] args) {
        addProduct();
    }


}
