/* 
 * @(#)LazySingleton.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.singleton.lazy;

/**
 * @author Robin
 * 
 *         懒汉式单例模式
 */
public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
