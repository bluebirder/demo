/* 
 * @(#)Calc.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.strategy;

/**
 * @author Robin
 */
public class Calc {
    public final static Add add = new Add();
    public final static Sub sub = new Sub();
    public final static Div div = new Div();
    public final static Multi multi = new Multi();
}
