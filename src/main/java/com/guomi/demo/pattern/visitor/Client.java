/* 
 * @(#)Client.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.visitor;

/**
 * @author Robin
 * 
 *         访问者模式
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // 对象结构类
        ObjectStructure o = new ObjectStructure();
        // 放入男人和女人
        o.add(new Man());
        o.add(new Woman());
        // 成功状态下访问
        Success visitor1 = new Success();
        o.show(visitor1);
        // 失败状态下访问
        Fail visitor2 = new Fail();
        o.show(visitor2);
    }

}
