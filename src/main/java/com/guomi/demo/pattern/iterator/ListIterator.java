/* 
 * @(#)ListIterator.java    Created on 2013-7-5
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.iterator;

import java.lang.reflect.Array;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Robin
 */
public class ListIterator<T> implements Iterator<T> {
    private List<T> list;

    private int index = 0;

    private int endIndex = -1;

    public ListIterator(List<T> list) {
        this.list = list;
        this.index = 0;
        if (list != null) {
            endIndex = list.size();
        }
    }

    @Override
    public boolean hasNext() {
        return (index < endIndex);
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return (T) Array.get(list, index++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove() method is not supported");
    }

}
