/* 
 * @(#)Sub.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.strategy;

/**
 * @author Robin
 */
public class Sub implements Operation {

    @Override
    public void op(double a, double b) {
        double result = a - b;
        System.out.println(result);
    }

}
