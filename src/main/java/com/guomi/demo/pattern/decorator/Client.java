/* 
 * @(#)Client.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.decorator;

/**
 * @author Robin
 * 
 *         装饰模式
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 不需要调料，即没有装饰者
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        // 使用了三个装饰者来装饰DarkRoast
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // 使用了两个装饰者来装饰HouseBlend
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}
