/* 
 * @(#)HelloWorldImpl.java    Created on 2013-8-14
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.service.impl;

import java.util.List;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.google.common.collect.Maps;
import com.guomi.clearn.common.entity.baseinfo.User;
import com.guomi.demo.service.HelloWorld;

/**
 * @author Robin
 */
@WebService(endpointInterface = "com.guomi.demo.service.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    Map<Integer, User> users = Maps.newLinkedHashMap();

    @Override
    public String sayHi(@WebParam(name = "text") String text) {
        return "Hello " + text;
    }

    @Override
    public String sayHiToUser(User user) {
        users.put(users.size() + 1, user);
        return "Hello " + user.getRealName();
    }

    @Override
    public String[] SayHiToUserList(List<User> userList) {
        String[] result = new String[userList.size()];
        int i = 0;
        for (User u : userList) {
            result[i] = "Hello " + u.getRealName();
            i++;
        }
        return result;
    }

}
