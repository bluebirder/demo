/* 
 * @(#)Man.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.visitor;

/**
 * @author Robin
 */
public class Man extends Person {
    private String sexMessage = "男人";

    /**
     * 访问男人时 调用 访问者的访问方法
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
