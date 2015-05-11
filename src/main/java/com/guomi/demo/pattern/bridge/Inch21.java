/* 
 * @(#)Inch21.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.bridge;

/**
 * @author Robin
 */
public class Inch21 extends Television {

    @Override
    public void teleview(TelevisionMaker televisionMaker) {
        System.out.println("21寸电视");
    }

}
