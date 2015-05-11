/* 
 * @(#)Haier.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.bridge;

/**
 * @author Robin
 */
public class Haier extends TelevisionMaker {

    public Haier() {
        System.out.println("海尔厂商");
    }

    @Override
    public void produce() {
        System.out.println("海尔厂商");
    }
}
