/* 
 * @(#)Context.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Robin
 * 
 *         上下文（环境）角色，使用HashMap来存储变量对应的数值
 */
public class Context {
    private Map<Variable, Integer> valueMap = new HashMap<>();

    public void addValue(Variable x, int y) {
        Integer yi = new Integer(y);
        valueMap.put(x, yi);
    }

    public int LookupValue(Variable x) {
        int i = valueMap.get(x).intValue();
        return i;
    }
}
