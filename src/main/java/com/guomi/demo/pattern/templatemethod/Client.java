/* 
 * @(#)Client.java    Created on 2013-7-5
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.templatemethod;

/**
 * @author Robin
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyTemplate opa = new MyOptionA();
        opa.doOperation();
        MyTemplate opb = new MyOptionB();
        opb.doOperation();
    }

}
