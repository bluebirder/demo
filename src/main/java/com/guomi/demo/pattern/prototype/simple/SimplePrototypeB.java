/* 
 * @(#)SimplePrototypeB.java    Created on 2013-7-2
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.prototype.simple;

/**
 * @author Robin
 */
public class SimplePrototypeB implements SimplePrototype {

    @Override
    public SimplePrototype clone() {
        // 最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        SimplePrototype prototype = new SimplePrototypeB();
        return prototype;
    }
}
