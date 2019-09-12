package com.bean;

import org.springframework.context.annotation.Bean;

public class Car {

    public Car(){
        System.out.println("car Contructor....");
    }


    public void init(){
        System.out.println("car............init.......");
    }

    public void detory(){
        System.out.println("car...................detory...");
    }
}
