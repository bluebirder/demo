/* 
 * @(#)Whip.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.decorator;

/**
 * @author Robin
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.55 + beverage.cost();
    }

}
