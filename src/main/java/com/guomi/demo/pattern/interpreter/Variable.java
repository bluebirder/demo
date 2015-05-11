/* 
 * @(#)Variable.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.interpreter;

/**
 * @author Robin
 */
public class Variable extends Expression {

    @Override
    public int interpret(Context con) {

        // this为调用interpret方法的Variable对象
        return con.LookupValue(this);
    }
}
