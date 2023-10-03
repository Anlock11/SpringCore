package com.example.bai7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Bai7Application {

    public static void main(String[] args) {

        ApplicationContext contenx = new ClassPathXmlApplicationContext("beans.xml");
        DataSource dt = (DataSource) contenx.getBean("dataSource");
        dt.print();


    }

}
