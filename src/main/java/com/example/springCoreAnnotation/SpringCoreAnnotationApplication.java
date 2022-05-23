package com.example.springCoreAnnotation;

import com.example.springCoreAnnotation.modal.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreAnnotationApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductConfig.class);
        applicationContext.getBean(Product.class).printSave();
    }
}
