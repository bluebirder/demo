/* 
 * @(#)Client.java    Created on 2013-7-2
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.prototype.simple;

/**
 * @author Robin
 */
public class Client {
    /**
     * 持有需要使用的原型接口对象
     */
    private SimplePrototype prototype;

    /**
     * 构造方法，传入需要使用的原型接口对象
     */
    public Client(SimplePrototype prototype) {
        this.prototype = prototype;
    }

    public void operation(SimplePrototype example) {
        // 需要创建原型接口的对象
        SimplePrototypeA copyPrototypeA = (SimplePrototypeA) prototype.clone();
        SimplePrototypeB copyPrototypeB = (SimplePrototypeB) prototype.clone();

    }
}
