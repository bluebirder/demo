/* 
 * @(#)DesktopTest.java    Created on 2013-8-20
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.test;

import junit.framework.TestCase;

import org.junit.Test;

import com.thoughtworks.selenium.Selenium;

/**
 * @author Robin
 */
public class DesktopTest extends TestCase {

    @Test
    public void testDesktop() throws Exception {
        Selenium selenium = SeleniumTest.selenium;
        assertTrue(selenium.isTextPresent("退出"));
    }
}
