/* 
 * @(#)Client.java    Created on 2013-6-27
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.factory;

/**
 * @author Robin
 */
public class Client {
    public static void main(String[] args) {
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1, 1);
        cf.makeComputer(2, 1);
    }
}
