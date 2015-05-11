/* 
 * @(#)Client.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.interpreter;

/**
 * @author Robin
 * 
 *         解释器模式
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context();
        Constant c1 = new Constant(11);
        Variable v1 = new Variable();
        context.addValue(v1, 10);
        Variable v2 = new Variable();
        context.addValue(v2, 20);
        Add addExpression = new Add(v1, v2);
        Variable addResult = new Variable();
        context.addValue(addResult, addExpression.interpret(context));
        Subtract subExpression = new Subtract(addResult, c1);
        Variable subResult = new Variable();
        context.addValue(subResult, subExpression.interpret(context));
        System.out.println(addResult.interpret(context));
        System.out.println(subResult.interpret(context));
    }

}
