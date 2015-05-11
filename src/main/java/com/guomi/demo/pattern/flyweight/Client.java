/* 
 * @(#)Client.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.flyweight;

/**
 * @author Robin
 * 
 *         亨元模式：运用共享技术有效地支持大量细粒度的对象
 */
public class Client {

    FlyweightFactory factory = new FlyweightFactory();
    Flyweight fly1;
    Flyweight fly2;
    Flyweight fly3;
    Flyweight fly4;
    Flyweight fly5;
    Flyweight fly6;

    /** */
    /** Creates a new instance of FlyweightPattern */
    public Client() {
        fly1 = factory.getFlyWeight("Google");
        fly2 = factory.getFlyWeight("Qutr");
        fly3 = factory.getFlyWeight("Google");
        fly4 = factory.getFlyWeight("Google");
        fly5 = factory.getFlyWeight("Google");
        fly6 = factory.getFlyWeight("Google");
    }// end FlyweightPattern()

    public void showFlyweight() {
        fly1.operation();
        fly2.operation();
        fly3.operation();
        fly4.operation();
        fly5.operation();
        fly6.operation();
        int objSize = factory.getFlyweightSize();
        System.out.println("objSize = " + objSize);
    }// end showFlyweight()

    public static void main(String[] args) {
        System.out.println("The FlyWeight Pattern!");
        Client fp = new Client();
        fp.showFlyweight();
    }// end main(...)

}
