package com.jimisun.action;

import ognl.DefaultTypeConverter;

import java.util.Map;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 11:08 2018-11-16
 * @Modified By:
 */
public class StringToProductTypeConverter extends DefaultTypeConverter {

    public StringToProductTypeConverter() {
        super();
    }

    @Override
    public Object convertValue(Map context, Object value, Class toType) {
        if (toType == Product.class) {
            String[] params = (String[]) value;
            Product product = new Product();
            String[] productValues = params[0].split(",");
            product.setProductName(productValues[0].trim());
            product.setPrice(Float.parseFloat(productValues[1].trim()));
            product.setCount(Integer.parseInt(productValues[2].trim()));
            return product;
        } else if (toType == String.class) {
            Product product = (Product) value;
            return product.toString();
        }
        return null;
    }

}


