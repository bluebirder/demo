/* 
 * @(#)Client.java    Created on 2013-7-2
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.builder;

/**
 * @author Robin
 * 
 *         建造者模式
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ProductBuilder builder = new ProductBuilder();
        Director director = new Director(builder);

        director.construct();
        Product product = builder.getProduct();
    }

}
