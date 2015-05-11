/* 
 * @(#)Client.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.composite;

/**
 * @author Robin
 * 
 *         组合模式
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Cabinet cabinet = new Cabinet("Tower");
        Chassis chassis = new Chassis("PC Chassis");

        // 将PC Chassis装到Tower中 (将盘盒装到箱子里)
        cabinet.add(chassis);
        // 将一个10GB的硬盘装到 PC Chassis (将硬盘装到盘盒里)
        chassis.add(new Disk("10 GB"));

        // 调用 netPrice()方法;
        System.out.println("netPrice = " + cabinet.netPrice());
        System.out.println("discountPrice = " + cabinet.discountPrice());
    }

}
