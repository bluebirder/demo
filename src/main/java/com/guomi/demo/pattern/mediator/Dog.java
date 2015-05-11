/* 
 * @(#)Dog.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.mediator;

/**
 * @author Robin
 */
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("the dog is eating the bone......");
    }

}
