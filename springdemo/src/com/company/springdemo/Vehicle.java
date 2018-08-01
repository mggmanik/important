package com.company.springdemo;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Vehicle {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("ApplicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Car carObject = (Car) factory.getBean("car");
        carObject.showDetails();
    }
}
