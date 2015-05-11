/* 
 * @(#)HungrySingleton.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.singleton.hungry;

/**
 * @author Robin
 * 
 *         饿汉式单例模式
 */
public class HungrySingleton {
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
