/* 
 * @(#)ProjectManager.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.responsibility;

/**
 * @author Robin
 * 
 *         项目经理审批
 */
public class ProjectManager extends Handler {

    @Override
    public String handlerFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 500) {
            if ("Joe".equals(user)) {
                str = "Project manager agreed " + user + "'s request, the fee is $" + fee;
            } else {
                str = "Project manager didn't agree " + user + "'s request.";
            }
            return str;
        }
        // more than $500, next to others.
        if (this.successor != null) {
            return successor.handlerFeeRequest(user, fee);
        }
        return str;
    }

}
