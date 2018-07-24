package com.example.designpattern.prototype;

public class PrototypeChild implements Cloneable {

    @Override
    public PrototypeChild clone() throws CloneNotSupportedException {
        return (PrototypeChild) super.clone();
    }
}
