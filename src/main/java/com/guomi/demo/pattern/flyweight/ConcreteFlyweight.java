/* 
 * @(#)ConcreteFlyweight.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.flyweight;

/**
 * @author Robin
 */
public class ConcreteFlyweight extends Flyweight {

    private String string;

    public ConcreteFlyweight(String str) {
        string = str;
    }// end ConcreteFlyweight(...)

    @Override
    public void operation() {
        System.out.println("Concrete---Flyweight : " + string);
    }// end operation()

}
