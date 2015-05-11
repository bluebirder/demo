/* 
 * @(#)Adapter.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.adapter.object;

import com.guomi.demo.pattern.adapter.clazz.ITarget;

/**
 * @author Robin
 * 
 *         对象适配器模式：适配多个对象，实现接口
 */
public class Adapter implements ITarget {

    private Animal animal;

    // private animal animal2....可以适配多个对象

    public Adapter(Animal animal) {
        this.animal = animal;
    }

    /**
     * DOC 拓展接口要求的新方法
     */
    @Override
    public void fly() {
        System.out.println("fly");
    }

    /**
     * DOC 使用源对象的方法
     */
    @Override
    public void run() {
        this.animal.run();
    }

}
