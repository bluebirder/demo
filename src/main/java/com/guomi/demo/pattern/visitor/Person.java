/* 
 * @(#)Person.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.visitor;

/**
 * @author Robin
 */
public abstract class Person {
    /**
     * 接受访问
     * 
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
