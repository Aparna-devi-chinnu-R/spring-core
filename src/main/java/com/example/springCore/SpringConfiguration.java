package com.example.springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean(name="productObj") //this name should be same as that of name in getBean , else we can use method name
    public Product product(){
        return new Product();
    }
}
