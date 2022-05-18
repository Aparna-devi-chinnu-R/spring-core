package com.example.springCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {

		// xml configuration
		// deprecated way
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
		Product product = beanFactory.getBean("product", Product.class);

		//correct way , return application context , can you also use BeanFactory instead of application context
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
		Product product1 = applicationContext.getBean("product", Product.class);

		// java configuration

		ApplicationContext applicationContext1  = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Product product2 = applicationContext1.getBean("productObj", Product.class);


	}



}
