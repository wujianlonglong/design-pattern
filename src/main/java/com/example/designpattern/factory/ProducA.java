package com.example.designpattern.factory;

public class ProducA implements Product{
    @Override
    public void doSomething() {
        System.out.println("打扫卫生");
    }
}
