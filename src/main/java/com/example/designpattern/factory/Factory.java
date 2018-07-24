package com.example.designpattern.factory;

/**
 * 工程模式
 */
public class Factory {

    public static Product doSomething(String productTag) {
        Product product = null;
        switch (productTag) {
            case "A":
                product = new ProducA();
                break;
            case "B":
                product = new ProductB();
                break;
            default:
                product = new ProducA();
                break;
        }
        return product;
    }

}
