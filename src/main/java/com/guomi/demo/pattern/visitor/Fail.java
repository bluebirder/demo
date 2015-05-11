/* 
 * @(#)Fail.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.visitor;

/**
 * @author Robin
 */
public class Fail extends Visitor {
    private String type = "失败";

    /**
     * 访问男人
     */
    @Override
    public void getVisitor(Man concreteElementA) {
        System.out.println(concreteElementA.getSexMessage() + type + "时,闷头喝酒谁也不用劝。");
    }

    /**
     * 访问女人
     */
    @Override
    public void getVisitor(Woman concreteElementB) {
        System.out.println(concreteElementB.getSexMessage() + type + "时,眼泪汪汪，谁也劝不了。");
    }

}
