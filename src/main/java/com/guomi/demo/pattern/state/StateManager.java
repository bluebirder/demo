/* 
 * @(#)StateManager.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.state;

/**
 * @author Robin
 */
public class StateManager {
    // 状态
    private State state;

    // 没有状态的构造器(不可见)
    private StateManager() {
    }

    // 带有初始状态的构造器
    public StateManager(State initState) {
        this.state = initState;
    }

    // 设置初始状态
    public void setState(State state) {
        this.state = state;
    }

    // 下一步
    public void nextStep() {
        if (this.state != null)
            this.state.nextStep(this);
    }

    // 上一步
    public void lastStep() {
        if (this.state != null)
            this.state.lastStep(this);
    }

    // 返回下一个状态
    public State nextState() {
        return this.state;
    }
}
