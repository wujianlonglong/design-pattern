package com.example.designpattern.single;

/**
 * 单例模式(静态内部类)
 */
public class SinglePattern {

    private SinglePattern() {
    }

    private static class Singleton {
        private static SinglePattern singlePattern = new SinglePattern();
    }

    public static SinglePattern getInstance() {
        return Singleton.singlePattern;
    }

}
