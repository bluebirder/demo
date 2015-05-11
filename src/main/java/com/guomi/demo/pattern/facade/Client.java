/* 
 * @(#)Client.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.facade;

/**
 * @author Robin
 * 
 *         外观模式：客户不再直接和子系统中的类交互，而是与外观交互
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ServiceA sa = new ServiceAImpl();
        ServiceB sb = new ServiceBImpl();
        sa.methodA();
        sb.methodB();
        System.out.println("=====================");
        Facade f = new Facade();
        f.methodA();
        f.methodB();
    }

}
