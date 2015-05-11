/* 
 * @(#)RegSingleton.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.singleton.register;

import java.util.HashMap;

/**
 * @author Robin
 * 
 *         登记式单例 - 解决单例模式无法继承问题
 */
public class RegSingleton {

    private static HashMap m_registry = new HashMap();

    static {
        RegSingleton instance = new RegSingleton();
        m_registry.put(instance.getClass().getName(), instance);
    }

    /**
     * 保护的默认构造子
     */
    protected RegSingleton() {
    }

    /**
     * 静态工厂方法，返还此类唯一的实例
     */
    public static RegSingleton getInstance(String name) {
        if (name == null) {
            name = "com.javapatterns.singleton.demos.RegSingleton";
        }
        if (m_registry.get(name) == null) {
            try {
                m_registry.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                System.out.println("Error happened.");
            }
        }
        return (RegSingleton) (m_registry.get(name));
    }
}
