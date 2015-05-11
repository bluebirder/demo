/* 
 * @(#)Iterator.java    Created on 2013-7-5
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.iterator;

/**
 * @author Robin
 * 
 *         迭代器模式
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();

    void remove();
}
