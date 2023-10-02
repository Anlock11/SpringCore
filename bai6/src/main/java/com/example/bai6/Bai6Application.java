package com.example.bai6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bai6Application {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Hello hello = (Hello) context.getBean("hello");
        hello.method1();
        System.out.println("\n");
        hello.method2();
    }

}
