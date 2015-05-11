/* 
 * @(#)FlyweightFactory.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.flyweight;

import java.util.Hashtable;

/**
 * @author Robin
 */
public class FlyweightFactory {
    private Hashtable<Object, Flyweight> flyweights = new Hashtable<>();

    public FlyweightFactory() {

    }

    public Flyweight getFlyWeight(Object obj) {
        Flyweight flyweight = flyweights.get(obj);
        if (flyweight == null) {
            // 产生新的ConcreteFlyweight
            flyweight = new ConcreteFlyweight((String) obj);
            flyweights.put(obj, flyweight);
        }
        return flyweight;
    }// end GetFlyWeight(...)

    public int getFlyweightSize() {
        return flyweights.size();
    }
}
