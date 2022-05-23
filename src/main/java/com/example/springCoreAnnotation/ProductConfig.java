package com.example.springCoreAnnotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example.springCoreAnnotation.modal"}) // to make spring search for the
                                                            // beans in this package only,else it will search all project file
public class ProductConfig {
}
