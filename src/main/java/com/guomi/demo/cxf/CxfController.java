/* 
 * @(#)CxfController.java    Created on 2013-8-14
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.cxf;

import javax.xml.ws.Endpoint;

import com.guomi.demo.service.impl.HelloWorldImpl;

/**
 * @author Robin
 */
public class CxfController {
    private static final String helloWorldAddress = "http://localhost:8085/helloWorld";

    public static void main(String[] args) {
        System.out.println("web service start");
        HelloWorldImpl implementor = new HelloWorldImpl();
        Endpoint.publish(helloWorldAddress, implementor);
        System.out.println("web service started");
    }
}
