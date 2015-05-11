/* 
 * @(#)Espresso.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.decorator;

/**
 * @author Robin
 */
public class Espresso extends Beverage {

    @Override
    public double cost() {
        return 1.06;
    }

}
