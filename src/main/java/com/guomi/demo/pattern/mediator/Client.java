/* 
 * @(#)Client.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.mediator;

/**
 * @author Robin
 * 
 *         中介者模式
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Mediator m = new MediatorImpl();
        System.out.println("the result of bone:");
        m.notice("bone");

        System.out.println("\n");
        System.out.println("the result of grass:");
        m.notice("grass");
    }
}
