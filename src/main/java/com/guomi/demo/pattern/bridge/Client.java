/* 
 * @(#)Client.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.bridge;

/**
 * @author Robin
 * 
 *         桥模式
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Inch29 i = new Inch29();
        i.teleview(new ChangHong());
    }

}
