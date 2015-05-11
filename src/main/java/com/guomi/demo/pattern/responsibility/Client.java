/* 
 * @(#)Client.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.responsibility;

/**
 * @author Robin
 * 
 *         职责链模式
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Handler h1 = new ProjectManager();
        Handler h2 = new DepManager();
        Handler h3 = new GeneralManager();

        h2.setSuccessor(h3);
        h1.setSuccessor(h2);

        String ret1 = h1.handlerFeeRequest("Joe", 300);
        System.out.println(ret1);
        String ret2 = h1.handlerFeeRequest("Yoyo", 300);
        System.out.println(ret2);

        String ret3 = h1.handlerFeeRequest("Joe", 800);
        System.out.println(ret3);
        String ret4 = h1.handlerFeeRequest("Yoyo", 800);
        System.out.println(ret4);

        String ret5 = h1.handlerFeeRequest("Joe", 1300);
        System.out.println(ret5);
        String ret6 = h1.handlerFeeRequest("Yoyo", 1300);
        System.out.println(ret6);
    }

}
