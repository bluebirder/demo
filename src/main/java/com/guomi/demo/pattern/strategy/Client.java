/* 
 * @(#)Client.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.strategy;

/**
 * @author Robin
 * 
 *         策略模式
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Calc c = new Calc();
        c.add.op(11, 22);
        c.sub.op(22, 11);
        c.div.op(33, 11);
        c.multi.op(33, 33);
    }

}
