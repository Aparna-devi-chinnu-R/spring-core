package com.example.springCore;

import java.beans.ConstructorProperties;

public class Product {

    private String productName;

    public Product() {
    }

    public Product(String productName) {  // this name should match with name in xml file constructor-arg
        super();
        this.productName = productName;
    }



    public void printProductName(String name, String price){
        System.out.println("The product " +name + "has a price " +price);
    }
}
