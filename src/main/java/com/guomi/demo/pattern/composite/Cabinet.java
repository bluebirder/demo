/* 
 * @(#)Cabinet.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.composite;

/**
 * @author Robin
 */
public class Cabinet extends CompositeEquipment {

    public Cabinet(String name) {
        super(name);
    }

    @Override
    public double netPrice() {
        return 1.0 + super.netPrice();
    }

    @Override
    public double discountPrice() {
        return 0.5 + super.discountPrice();
    }
}
