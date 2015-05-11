/* 
 * @(#)Controller.java    Created on 2013-7-9
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.command;

/**
 * @author Robin
 * 
 *         控制者
 */
public class Controller {
    private Command onCommand, offCommand, changeChannel;

    public Controller(Command on, Command off, Command channel) {
        onCommand = on;
        offCommand = off;
        changeChannel = channel;
    }

    public void turnOn() {
        onCommand.excute();
    }

    public void turnOff() {
        offCommand.excute();
    }

    public void changeChannel() {
        changeChannel.excute();
    }
}
