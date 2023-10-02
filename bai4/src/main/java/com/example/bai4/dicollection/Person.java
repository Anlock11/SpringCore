package com.example.bai4.dicollection;

import java.util.List;

public class Person {
    public String name;
    public int age;
    public List<String> emails;
    public List<Address> addresses;
    public Person(){

    }

    public Person(String name, int age, List<String> emails, List<Address> addresses) {
        this.name = name;
        this.age = age;
        this.emails = emails;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    public void print() {
        System.out.println("Person: " + this.name + " Age: " + this.age);
        System.out.println("Address: ");
        for (Address address : addresses) {
            System.out.println(address);
        }
        System.out.println("Email:");
        for (String email : emails) {
            System.out.println(email);
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
    }
}
