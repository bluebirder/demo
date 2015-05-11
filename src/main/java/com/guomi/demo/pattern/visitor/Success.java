/* 
 * @(#)Success.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.visitor;

/**
 * @author Robin
 */
public class Success extends Visitor {
    private String type = "成功";

    /**
     * 访问男人
     */
    @Override
    public void getVisitor(Man concreteElementA) {
        System.out.println(concreteElementA.getSexMessage() + type + "时,背后多半有一个伟大的女人。");
    }

    /**
     * 访问女人
     */
    @Override
    public void getVisitor(Woman concreteElementB) {
        System.out.println(concreteElementB.getSexMessage() + type + "时,背后多半有一个不成功的男人。");
    }

}
