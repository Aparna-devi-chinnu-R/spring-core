package com.example.springCore;

public class Product {

    private String productName;
    private Price price;

    public Product() {
    }

    public Product(String productName) {  // this name should match with name in xml file constructor-arg
        super();
        this.productName = productName;
    }

    public Product(String productName, Price price) {
        this.productName = productName;
        this.price = price;
    }

    public void printProductName(String name, String price){
        System.out.println("The product " +name + "has a price " +price);
    }
}
