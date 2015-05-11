/* 
 * @(#)Sheep.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.mediator;

/**
 * @author Robin
 */
public class Sheep implements Animal {

    @Override
    public void eat() {
        System.out.println("the sheep is eating the grass......");
    }

}
