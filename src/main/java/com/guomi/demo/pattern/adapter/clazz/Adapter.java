/* 
 * @(#)Adapter.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.adapter.clazz;

/**
 * @author Robin
 * 
 *         类适配器模式：继承源类，实现目标接口
 */
public class Adapter extends Sources implements ITarget {

    @Override
    public void fly() {
        System.out.println("fly");
    }

}
