/* 
 * @(#)MyObserver.java    Created on 2013-7-5
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.observer;

/**
 * @author Robin
 * 
 *         观察者
 */
public interface MyObserver {
    void update(ObservedObject o, Object arg);
}
