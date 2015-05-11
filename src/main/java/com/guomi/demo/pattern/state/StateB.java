/* 
 * @(#)StateB.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.state;

/**
 * @author Robin
 */
public class StateB implements State {
    // B->A
    @Override
    public void lastStep(StateManager c) {
        c.setState(new StateA());
    }

    // B->C
    @Override
    public void nextStep(StateManager c) {
        c.setState(new StateC());
    }

    @Override
    public String toString() {
        return "State B";
    }

}
