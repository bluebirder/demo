/* 
 * @(#)RegSingletonChild.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.singleton.register;

/**
 * @author Robin
 */
public class RegSingletonChild extends RegSingleton {
    public RegSingletonChild() {
    }

    /**
     * 静态工厂方法
     */
    public static RegSingletonChild getInstance() {
        return (RegSingletonChild) RegSingleton.getInstance("pattern.singleton.RegSingletonChild");
    }
}
