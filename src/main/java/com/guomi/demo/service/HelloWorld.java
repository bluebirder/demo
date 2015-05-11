/* 
 * @(#)HelloWorld.java    Created on 2013-8-14
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.guomi.clearn.common.entity.baseinfo.User;

/**
 * @author Robin
 */
@WebService
public interface HelloWorld {
    String sayHi(@WebParam(name = "text") String text);

    String sayHiToUser(User user);

    String[] SayHiToUserList(List<User> userList);
}
