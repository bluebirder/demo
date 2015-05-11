/* 
 * @(#)Visitor.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.visitor;

/**
 * @author Robin
 * 
 *         访问者
 */
public abstract class Visitor {
    /**
     * 访问男人的反应 抽象
     * 
     * @param concreteElementA
     */
    public abstract void getVisitor(Man concreteElementA);

    /**
     * 访问女人的反应 抽象
     */

    public abstract void getVisitor(Woman concreteElementB);
}
