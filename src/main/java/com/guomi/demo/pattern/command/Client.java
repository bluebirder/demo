/* 
 * @(#)Client.java    Created on 2013-7-5
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.command;

/**
 * @author Robin
 * 
 *         命令模式
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 命令接收者
        Tv myTv = new Tv();
        // 开机命令
        Command on = new CommandOn(myTv);
        // 关机命令
        Command off = new CommandOff(myTv);
        // 频道切换命令
        Command channel = new CommandChannel(myTv, 2);
        // 命令控制对象
        Controller controller = new Controller(on, off, channel);
        // 开机
        controller.turnOn();
        // 切换频道
        controller.changeChannel();
        // 关机
        controller.turnOff();
    }

}
