package com.example.bai3;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Bai3Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld1 = (HelloWorld) context.getBean("helloWorld1");
        helloWorld1.Print();
        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld2");
        helloWorld2.Print();
    }

}
