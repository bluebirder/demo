/* 
 * @(#)SeleniumTest.java    Created on 2013-7-11
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.test;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

/**
 * @author Robin
 */
public class SeleniumTest {
    private static final String username = "liuhan";
    private static final String password = "1";

    public static Selenium selenium;

    @Before
    public void setUp() throws Exception {
        // selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://192.168.1.41");
        selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://mail.163.com/");
        selenium.start();
    }

    @Test
    public void testLogin() throws Exception {
        selenium.open("/");
        selenium.type("name=username", "bluebird");
        while (true) {
            for (int i = 6; i < 17; i++) {
                selenium.type("name=password", radomString(i));
            }
            break;
        }
        selenium.click("xpath=//form/button[@type='submit']");
        assertTrue(selenium.isTextPresent("用户名或密码错误"));
        selenium.type("name=password", password);
        selenium.click("xpath=//form/button[@type='submit']");
        selenium.waitForPageToLoad("30000");
        // assertTrue(selenium.isTextPresent("退出"));
    }

    @After
    public void tearDown() throws Exception {
        selenium.stop();
    }

    private String radomString(int len) {
        String str = null;
        char s[] = new char[len];
        for (int j = 0; j < len; j++) {
            s[j] = (char) new Random().nextInt(128);
        }
        str = new String(s);
        return str;
    }
}
