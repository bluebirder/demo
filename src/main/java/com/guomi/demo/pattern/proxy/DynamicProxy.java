/* 
 * @(#)DynamicProxy.java    Created on 2013-7-12
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Robin
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before Invoke ! method : " + method);

        // 我们可以再代理方法调用前后添加功能
        Object result = method.invoke(object, args);

        System.out.println("object : " + object + "\tresult : " + result + "\targs : " + args);
        System.out.println("After Invoke !");
        return result;
    }

}
