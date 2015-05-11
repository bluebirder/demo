/* 
 * @(#)Garden.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.abstractfactory;

/**
 * @author Robin
 * 
 *         抽象工厂模式
 */
public abstract class Garden {
    public abstract Plant getShade(); // 花台中的植物

    public abstract Plant getCenter(); // 中间的植物

    public abstract Plant getBorder(); // 边上的植物
}
