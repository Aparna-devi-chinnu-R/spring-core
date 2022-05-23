package com.example.springCoreAnnotation.modal;

import org.springframework.stereotype.Component;

@Component //says to spring that it is a bean
public class Product {

    public void printSave(){
        System.out.println("save");
    }
}
