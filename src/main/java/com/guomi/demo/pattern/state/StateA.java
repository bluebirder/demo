/* 
 * @(#)StateA.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.state;

/**
 * @author Robin
 */
public class StateA implements State {
    // A->C
    @Override
    public void lastStep(StateManager c) {
        c.setState(new StateC());
    }

    // A->B
    @Override
    public void nextStep(StateManager c) {
        c.setState(new StateB());
    }

    @Override
    public String toString() {
        return "State A";
    }

}
