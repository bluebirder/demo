/* 
 * @(#)Director.java    Created on 2013-7-2
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.builder;

/**
 * @author Robin
 * 
 *         指导者 - 指导建造者组装部件生产产品
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
