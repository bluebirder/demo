/* 
 * @(#)Client.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.memento;

/**
 * @author Robin
 * 
 *         备忘录模式（标记模式）： 在该对象之外保存上一次状态
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Originator o = new Originator();
        o.createMemento();
        o.modifyState4Test(80);
        o.setMemento();
    }

}
