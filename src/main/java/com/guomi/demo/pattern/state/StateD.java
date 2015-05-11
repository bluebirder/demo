/* 
 * @(#)StateD.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.state;

/**
 * @author Robin
 */
public class StateD implements State {

    // D->B
    @Override
    public void lastStep(StateManager c) {
        c.setState(new StateB());
    }

    // D->null(end)
    @Override
    public void nextStep(StateManager c) {
        c.setState(null);
    }

    @Override
    public String toString() {
        return "State D";
    }

}
