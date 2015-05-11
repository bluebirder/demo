/* 
 * @(#)Constant.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.interpreter;

/**
 * @author Robin
 */
public class Constant extends Expression {

    private int i;

    public Constant(int i) {
        this.i = i;
    }

    @Override
    public int interpret(Context con) {
        return i;
    }

}
