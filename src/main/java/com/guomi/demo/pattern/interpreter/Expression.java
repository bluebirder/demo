/* 
 * @(#)Expression.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.interpreter;

/**
 * @author Robin
 */
public abstract class Expression {
    public abstract int interpret(Context con);
}
