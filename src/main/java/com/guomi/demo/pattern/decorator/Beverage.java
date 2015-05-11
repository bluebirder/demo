/* 
 * @(#)Beverage.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.decorator;

/**
 * @author Robin
 * 
 *         装饰模式：将已实现的方法重写成抽象方法，再实现
 * 
 *         被装饰者抽象类
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
