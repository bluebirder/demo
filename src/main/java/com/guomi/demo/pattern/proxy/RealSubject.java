/* 
 * @(#)RealSubject.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.proxy;

/**
 * @author Robin
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("RealSubject.doSomething");
    }

}
