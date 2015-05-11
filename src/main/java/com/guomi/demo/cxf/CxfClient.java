/* 
 * @(#)CxfClient.java    Created on 2013-8-14
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.cxf;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.guomi.clearn.common.entity.baseinfo.User;
import com.guomi.demo.service.HelloWorld;

/**
 * @author Robin
 */
public class CxfClient {
    private static final String helloWorldAddress = "http://localhost:8085/helloWorld";

    public static void main(String[] args) {
        JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
        svr.setServiceClass(HelloWorld.class);
        svr.setAddress(helloWorldAddress);
        HelloWorld hw = (HelloWorld) svr.create();
        User user = new User();
        user.setRealName("Tony");
        System.out.println(hw.sayHiToUser(user));
    }
}
