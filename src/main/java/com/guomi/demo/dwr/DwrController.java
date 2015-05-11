/* 
 * @(#)DwrController.java    Created on 2013-8-9
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.dwr;

import uk.ltd.getahead.dwr.util.Logger;

import com.guomi.clearn.common.entity.baseinfo.User;

/**
 * @author Robin
 */
public class DwrController {
    private static final Logger log = Logger.getLogger(DwrController.class);

    public User find(String id) {
        User u = new User();
        u.setId(id);
        log.info("find user: " + id);
        return u;
    }

    public boolean save(User user) {
        log.info("save user: " + user.getRealName());
        return true;
    }
}
