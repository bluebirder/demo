/* 
 * @(#)Inch29.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.bridge;

/**
 * @author Robin
 */
public class Inch29 extends Television {

    @Override
    public void teleview(TelevisionMaker televisionMaker) {
        System.out.println("29寸电视");
    }

}
