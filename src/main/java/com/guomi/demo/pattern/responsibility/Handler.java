/* 
 * @(#)Handler.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.responsibility;

/**
 * @author Robin
 * 
 *         职责对象的接口
 */
public abstract class Handler {

    protected Handler successor;

    /**
     * 设置下一个处理请求对象
     * 
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     * 
     * @param user
     *            申请人
     * @param fee
     *            申请的费用
     * @return
     */
    public abstract String handlerFeeRequest(String user, double fee);
}
