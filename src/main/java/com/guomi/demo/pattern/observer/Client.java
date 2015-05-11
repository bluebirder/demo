/* 
 * @(#)Client.java    Created on 2013-7-5
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.observer;

/**
 * @author Robin
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyObserver myObserverA = new MyObserverA();
        MyObserver myObserverB = new MyObserverB();
        ObservedObject observed = new ObservedObject();
        observed.addObserver(myObserverA);
        observed.addObserver(myObserverB);
        observed.doBusiness("A");
    }

}
