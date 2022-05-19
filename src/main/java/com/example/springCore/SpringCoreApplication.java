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

		//setter based injection
		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("springConfig.xml");
		Price price = applicationContext2.getBean(Price.class);

		//different configuration file and importing it
		ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("productConfig.xml");
		Product product3 = applicationContext3.getBean(Product.class);

		// java configuration
		//constructor based injection
		ApplicationContext applicationContext1  = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Product product2 = applicationContext1.getBean("productObj", Product.class);








	}



}
