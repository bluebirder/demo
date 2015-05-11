/* 
 * @(#)PracticalGarden.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.abstractfactory;

/**
 * @author Robin
 */
public class PracticalGarden extends Garden {
    @Override
    public Plant getShade() {
        return new Plant("葡萄");
    }

    @Override
    public Plant getCenter() {
        return new Plant("石榴");
    }

    @Override
    public Plant getBorder() {
        return new Plant("丝瓜");
    }
}
