/* 
 * @(#)GeneralManager.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.responsibility;

/**
 * @author Robin
 * 
 *         总经理审批
 */
public class GeneralManager extends Handler {

    @Override
    public String handlerFeeRequest(String user, double fee) {
        String str = "";
        if (fee >= 1000) {
            if ("Joe".equals(user)) {
                str = "General manager agreed " + user + "'s request, the fee is $" + fee;
            } else {
                str = "General manager didn't agree " + user + "'s request.";
            }
            return str;
        }
        // next to others.
        if (this.successor != null) {
            return successor.handlerFeeRequest(user, fee);
        }
        return str;
    }

}
