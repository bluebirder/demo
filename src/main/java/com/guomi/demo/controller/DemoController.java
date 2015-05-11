/* 
 * @(#)DemoController.java    Created on 2013-6-19
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guomi.meazza.util.StringUtils;

/**
 * @author Robin
 */
@Controller
@RequestMapping("/")
public class DemoController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/jQueryTest", method = RequestMethod.GET)
    public String toJQueryTest(String subject, Model model) {
        if (StringUtils.isEmpty(subject)) {
            subject = "sx";
        }
        model.addAttribute("subject", subject);
        return "/jQueryTest";
    }

    @RequestMapping(value = "/javaTest", method = RequestMethod.GET)
    public String toJavaTest(Model model) {
        return "/javaTest";
    }

    @RequestMapping(value = "/dwrTest", method = RequestMethod.GET)
    public String toDWRTest(Model model) {
        return "/dwrTest";
    }

    @RequestMapping(value = "/seleniumTest", method = RequestMethod.GET)
    public String toSeleniumTest(Model model) {
        return "/seleniumTest";
    }
}
