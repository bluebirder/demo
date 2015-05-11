/* 
 * @(#)Builder.java    Created on 2013-7-2
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.builder;

/**
 * @author Robin
 * 
 *         建造者模式
 * 
 *         建造者 - 部件和建造过程分离
 */
public interface Builder {
    void buildPartA();

    void buildPartB();

    void buildPartC();

    Product getProduct();
}
