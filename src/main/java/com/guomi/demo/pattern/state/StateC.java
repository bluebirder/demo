/* 
 * @(#)StateC.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.state;

/**
 * @author Robin
 */
public class StateC implements State {
    // C->null(end)
    @Override
    public void lastStep(StateManager c) {
        c.setState(null);
    }

    // C->D
    @Override
    public void nextStep(StateManager c) {
        c.setState(new StateD());
    }

    @Override
    public String toString() {
        return "State C";
    }

}
