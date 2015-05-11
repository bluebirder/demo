/* 
 * @(#)CommandOn.java    Created on 2013-7-9
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.command;

/**
 * @author Robin
 */
public class CommandOn implements Command {
    private Tv myTv;

    public CommandOn(Tv tv) {
        myTv = tv;
    }

    @Override
    public void excute() {
        myTv.turnOn();
    }
}
