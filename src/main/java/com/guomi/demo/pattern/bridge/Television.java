/* 
 * @(#)Television.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.bridge;

/**
 * @author Robin
 */
public abstract class Television {
    // 电视厂商
    protected TelevisionMaker televisionMaker;

    // 收看电视
    abstract public void teleview(TelevisionMaker televisionMaker);
}
