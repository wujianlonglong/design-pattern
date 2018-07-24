package com.example.designpattern.proxy;

/**
 * 静态代理
 */
public class BuyCareProxy implements BuyCare {

    private BuyCare buyCare;

    public BuyCareProxy(BuyCare buyCare) {
        this.buyCare = buyCare;
    }

    @Override
    public void buyCare() {
        System.out.println("买车前准备");
        buyCare.buyCare();
        System.out.println("买车结束");
    }
}
