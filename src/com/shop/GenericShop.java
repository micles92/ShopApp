package com.shop;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Wojtek on 2015-11-23.
 */
public class GenericShop {
    private ArrayList<Product> products;

    public GenericShop() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void removeProduct(String name){
        Iterator<Product> iterator = products.iterator();

        while(iterator.hasNext()){
            Product tmp = iterator.next();
            if(tmp.getName().equals(name)){
                iterator.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "GenericShop{" +
                "products=" + products +
                '}';
    }

    public void displayDiscount(){
        for(Product tmp: products){
            tmp.discount();
        }
    }
}
