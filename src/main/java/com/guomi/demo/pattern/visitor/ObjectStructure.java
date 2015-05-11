/* 
 * @(#)ObjectStructure.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robin
 */
public class ObjectStructure {
    /**
     * 很多人的结合
     */
    private List<Person> elements = new ArrayList<>();

    /**
     * 生人
     * 
     * @param element
     */
    public void add(Person element) {
        elements.add(element);
    }

    /**
     * 杀人
     * 
     * @param element
     */
    public void delete(Person element) {
        elements.remove(element);
    }

    /**
     * 排队报数 访问状态下 人的反应
     * 
     * @param visitor
     */
    public void show(Visitor visitor) {
        for (Person e : elements) {
            e.accept(visitor);
        }
    }
}
