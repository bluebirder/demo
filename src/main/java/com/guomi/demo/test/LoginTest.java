/* 
 * @(#)LoginTest.java    Created on 2013-8-20
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.test;

import junit.framework.TestCase;

import org.junit.Test;

import com.thoughtworks.selenium.Selenium;

/**
 * @author Robin
 */
public class LoginTest extends TestCase {
    private static final String username = "liuhan";
    private static final String password = "1";

    @Test
    public void testLogin() throws Exception {
        Selenium selenium = SeleniumTest.selenium;
        selenium.open("/");
        selenium.type("name=username", username);
        selenium.type("name=password", "wrongPassword");
        selenium.click("xpath=//form/button[@type='submit']");
        assertTrue(selenium.isTextPresent("用户名或密码错误"));
        selenium.type("name=password", password);
        selenium.click("xpath=//form/button[@type='submit']");
        selenium.waitForPageToLoad("30000");
        assertFalse(selenium.isTextPresent("用户名或密码错误"));
    }
}
