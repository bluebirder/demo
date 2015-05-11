/* 
 * @(#)TestAnnotation.java    Created on 2013-9-6
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Robin
 */
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
public @interface TestAnnotation {
    String[] value() default {};

    RequestMethod method() default RequestMethod.GET;
}
