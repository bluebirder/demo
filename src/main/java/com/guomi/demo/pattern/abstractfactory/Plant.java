/* 
 * @(#)Plant.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.abstractfactory;

/**
 * @author Robin
 */
public class Plant {
    String name;

    public Plant(String pname) {
        name = pname;
    }

    public String getName() {
        return name;
    }
}
