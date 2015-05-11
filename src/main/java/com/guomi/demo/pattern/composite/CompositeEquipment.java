/* 
 * @(#)CompositeEquipment.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Robin
 */
public abstract class CompositeEquipment extends Equipment {

    private int i = 0;
    // 定义一个Vector 用来存放'儿子'
    private List<Equipment> equipment = new ArrayList<>();

    public CompositeEquipment(String name) {
        super(name);
    }

    @Override
    public boolean add(Equipment equipment) {
        this.equipment.add(equipment);
        return true;
    }

    @Override
    public double netPrice() {
        double netPrice = 0.0;
        Iterator<Equipment> iter = equipment.iterator();
        while (iter.hasNext()) {
            netPrice += iter.next().netPrice();
        }
        return netPrice;
    }

    @Override
    public double discountPrice() {
        double discountPrice = 0.0;
        Iterator<Equipment> iter = equipment.iterator();
        while (iter.hasNext()) {
            discountPrice += iter.next().discountPrice();
        }
        return discountPrice;
    }

    @Override
    public Iterator<Equipment> iter() {
        return equipment.iterator();
    }
}
