/* 
 * @(#)Tv.java    Created on 2013-7-9
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.command;

/**
 * @author Robin
 * 
 *         命令接受者
 */
public class Tv {
    public int currentChannel = 0;

    public void turnOn() {
        System.out.println("The televisino is on.");
    }

    public void turnOff() {
        System.out.println("The television is off.");
    }

    public void changeChannel(int channel) {
        this.currentChannel = channel;
        System.out.println("Now TV channel is " + channel);
    }
}
