/* 
 * @(#)ElegantGarden.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.abstractfactory;

/**
 * @author Robin
 */
public class ElegantGarden extends Garden {
    @Override
    public Plant getShade() {
        return new Plant("郁金香");
    }

    @Override
    public Plant getCenter() {
        return new Plant("榕树");
    }

    @Override
    public Plant getBorder() {
        return new Plant("兰草");
    }
}
