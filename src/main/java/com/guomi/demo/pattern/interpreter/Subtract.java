/* 
 * @(#)Subtract.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.interpreter;

/**
 * @author Robin
 */
public class Subtract extends Expression {

    private Expression left, right;

    public Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context con) {
        return left.interpret(con) - right.interpret(con);
    }

}
