/* 
 * @(#)ProductBuilder.java    Created on 2013-7-2
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.builder;

/**
 * @author Robin
 * 
 *         具体建造者
 */
public class ProductBuilder implements Builder {
    private Part partA, partB, partC;

    @Override
    public void buildPartA() {
        // 这里是具体如何构建partA的代码
    }

    @Override
    public void buildPartB() {
        // 这里是具体如何构建partB的代码
    }

    @Override
    public void buildPartC() {
        // 这里是具体如何构建partC的代码
    }

    @Override
    public Product getProduct() {
        buildPartA();
        buildPartB();
        buildPartC();
        return null;
    }
}
