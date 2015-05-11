/* 
 * @(#)IntelCpu.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.factory;

/**
 * @author Robin
 */
public class IntelCpu implements Cpu {

    /**
     * CPU的针脚数
     */
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数：" + pins);
    }

}
