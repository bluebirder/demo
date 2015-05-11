/* 
 * @(#)CommandChannel.java    Created on 2013-7-9
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.command;

/**
 * @author Robin
 */
public class CommandChannel implements Command {
    private Tv myTv;
    private int channel;

    public CommandChannel(Tv tv, int channel) {
        myTv = tv;
        this.channel = channel;
    }

    @Override
    public void excute() {
        myTv.changeChannel(channel);
    }
}
