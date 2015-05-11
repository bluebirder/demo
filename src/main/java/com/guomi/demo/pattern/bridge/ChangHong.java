/* 
 * @(#)ChangHong.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.bridge;

/**
 * @author Robin
 */
public class ChangHong extends TelevisionMaker {

    public ChangHong() {
        System.out.println("长虹厂商");
    }

    @Override
    public void produce() {
        System.out.println("长虹厂商");
    }

}
