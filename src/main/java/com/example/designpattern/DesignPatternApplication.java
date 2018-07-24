package com.example.designpattern;

import com.example.designpattern.factory.Factory;
import com.example.designpattern.factory.Product;
import com.example.designpattern.prototype.PrototypePattern;
import com.example.designpattern.proxy.BuyCare;
import com.example.designpattern.proxy.BuyCareImp;
import com.example.designpattern.proxy.BuyCareProxy;
import com.example.designpattern.proxy.DynamicProxyHandler;
import com.example.designpattern.single.SinglePattern;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Proxy;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        SpringApplication.run(DesignPatternApplication.class, args);

        //单例
        SinglePattern singlePattern = SinglePattern.getInstance();

        //原型
        PrototypePattern prototypePattern = new PrototypePattern();
        PrototypePattern child = prototypePattern.clone();

        //工程模式
        Product product = Factory.doSomething("A");
        product.doSomething();

        //静态代理
        BuyCare buyCare = new BuyCareImp();
        BuyCareProxy buyCareProxy = new BuyCareProxy(buyCare);
        buyCareProxy.buyCare();

        //动态代理
        BuyCare buyCares= new BuyCareImp();
        BuyCare proxyBuyCare = (BuyCare) Proxy.newProxyInstance(BuyCare.class.getClassLoader(), new
                Class[]{BuyCare.class}, new DynamicProxyHandler(buyCares));
        proxyBuyCare.buyCare();
    }
}
