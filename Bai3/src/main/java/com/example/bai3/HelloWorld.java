package com.example.bai3;

public class HelloWorld {
    private String mess;

    public HelloWorld(String mess) {
        this.mess = mess;
    }
    public HelloWorld(){

    }

    public void setMess(String mess) {
        this.mess = mess;
    }
    public void Print(){
        System.out.println("Inject: " + this.mess);
    }
}
