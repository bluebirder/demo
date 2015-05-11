/* 
 * @(#)AnnotationController.java    Created on 2013-9-6
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.annotation;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Robin
 */
@TestAnnotation(value = "a")
public class AnnotationController {

    @TestAnnotation(value = { "b", "c" })
    public AnnotationController() {

    }

    @TestAnnotation(value = { "d", "e" }, method = RequestMethod.GET)
    public void testAnno() {

    }
}
