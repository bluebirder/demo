/* 
 * @(#)Div.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.strategy;

/**
 * @author Robin
 */
public class Div implements Operation {

    @Override
    public void op(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println(result);
        } else {
            System.out.println("除0了！");
        }
    }

}
