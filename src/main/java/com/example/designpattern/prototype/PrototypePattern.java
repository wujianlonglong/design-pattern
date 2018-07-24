package com.example.designpattern.prototype;

/**
 * 原型模式
 */
public class PrototypePattern implements Cloneable {

    private PrototypeChild prototypeChild = new PrototypeChild();

    private int x;

    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPrototypeChild(PrototypeChild prototypeChild) {
        this.prototypeChild = prototypeChild;
    }


    @Override
    public PrototypePattern clone() throws CloneNotSupportedException {
        PrototypePattern prototypePattern = (PrototypePattern) super.clone();
        prototypePattern.setPrototypeChild(prototypeChild.clone());
        return prototypePattern;
    }


}
