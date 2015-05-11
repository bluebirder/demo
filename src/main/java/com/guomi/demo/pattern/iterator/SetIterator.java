/* 
 * @(#)SetIterator.java    Created on 2013-7-5
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.iterator;

/**
 * @author Robin
 */
public class SetIterator<T> implements Iterator<T> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void remove() {

    }

}
