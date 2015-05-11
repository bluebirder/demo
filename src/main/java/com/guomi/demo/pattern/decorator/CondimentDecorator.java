/* 
 * @(#)CondimentDecorator.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.decorator;

/**
 * @author Robin
 * 
 *         装饰者抽象类
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
