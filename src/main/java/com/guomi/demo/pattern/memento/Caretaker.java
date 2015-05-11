/* 
 * @(#)Caretaker.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.memento;

/**
 * @author Robin
 * 
 *         备忘录管理者角色
 */
public class Caretaker {
    private MementoIF m;

    public void saveMemento(MementoIF m) {
        this.m = m;
    }

    public MementoIF getMemento() {
        return m;
    }
}
