/* 
 * @(#)GardenMaker.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.abstractfactory;

/**
 * @author Robin
 */
public class GardenMaker {
    // 抽象工厂类
    private Garden garden;

    public Garden getGarden(String gtype) {
        garden = new ElegantGarden(); // 缺省情况
        if (gtype.equals("实用型")) {
            garden = new PracticalGarden();
        }
        if (gtype.equals("懒人型")) {
            garden = new LasyGarden();
        }
        return garden;
    }
}
