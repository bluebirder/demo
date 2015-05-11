/* 
 * @(#)MyTemplate.java    Created on 2013-7-5
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.templatemethod;

/**
 * @author Robin
 * 
 *         模板方法模式
 */
public abstract class MyTemplate {
    /**
     * 如果操作前和操作后的过程都是一样的，可以抽取成模板方法， 而操作的方法可以定义成抽象方法让用户实现
     */
    public void doOperation() {
        // 1
        beforeOperation();

        // 2
        operation();

        // 3
        afterOperation();
    }

    // 需要在操作前执行的方法
    private void beforeOperation() {
        System.out.println("This action before the operation!");
    }

    // 需要在操作后执行的方法
    private void afterOperation() {
        System.out.println("This action after the operation!");
    }

    // 需要推迟到子类(实现类) 中执行
    protected abstract void operation();
}
