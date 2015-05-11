/* 
 * @(#)Woman.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.visitor;

/**
 * @author Robin
 */
public class Woman extends Person {
    private String sexMessage = "女人";

    /**
     * 访问女人时，调用 访问者的 目的
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.getVisitor(this);
    }

    /**
     * @return the sexMessage
     */
    public String getSexMessage() {
        return sexMessage;
    }
}
