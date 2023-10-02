package com.example.bai4;


import com.example.bai4.dicollection.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Bai4Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Person person = (Person) context.getBean("person");
        person.print();
        Person person1 = (Person) context.getBean("person2");
        person1.print();
        Person person2 = (Person) context.getBean("person2");
        person1.print();


    }

}