/* 
 * @(#)CommandOff.java    Created on 2013-7-9
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.command;

/**
 * @author Robin
 */
public class CommandOff implements Command {
    private Tv myTv;

    public CommandOff(Tv tv) {
        myTv = tv;
    }

    @Override
    public void excute() {
        myTv.turnOff();
    }
}
