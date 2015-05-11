/* 
 * @(#)State.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.state;

/**
 * @author Robin
 * 
 *         状态接口
 */
public interface State {
    // 执行'上一步' 操作
    public void lastStep(StateManager c);

    // 执行'下一步' 操作
    public void nextStep(StateManager c);
}
