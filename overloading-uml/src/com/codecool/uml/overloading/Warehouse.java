package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    List<Product> products = new ArrayList<>();

    public void addProduct (Product product){
        products.add(product);
    };

    public List<Product> getProduct() {
        return products;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory){
        List<Product> productsby = new ArrayList<>();
        for (int i = 0; i <= productsby.size() ; i++) {
            if(products.get(i).getProductCategory().equals(productCategory)) {
                productsby.add(products.get(i));
            }
        }
        return productsby;
    };

    public List<Product> getAllProductBy(Supplier Supplier) {
        List<Product> productsby2 = new ArrayList<>();
        for (int i = 0; i <= productsby2.size() ; i++) {
            if(products.get(i).getSupplier().equals(Supplier)) {
                productsby2.add(products.get(i));
            }
        }
        return productsby2;
    };


}
