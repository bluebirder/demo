/* 
 * @(#)ObservedObject.java    Created on 2013-7-5
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.observer;

import java.util.Vector;

/**
 * @author Robin
 * 
 *         观察者模式
 */
public class ObservedObject {
    private boolean changed = false;
    private Vector observers;

    // 创建被观察者时就创建一个它持有的观察者列表，注意，这个列表是需要同步的。
    public ObservedObject() {
        observers = new Vector();
    }

    public void setChanged() {
        changed = true;
    }

    /**
     * 添加观察者到观察者列表中去
     */
    public synchronized void addObserver(MyObserver o) {
        if (o == null)
            throw new NullPointerException();
        if (!observers.contains(o)) {
            observers.addElement(o);
        }
    }

    /**
     * 删除一个观察者
     */
    public synchronized void deleteObserver(MyObserver o) {
        observers.removeElement(o);
    }

    /**
     * 通知操作，即被观察者发生变化，通知对应的观察者进行事先设定的操作，不传参数的通知方法
     */
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * 与上面的那个通知方法不同的是，这个方法接受一个参数，这个参数一直传到观察者里，以供观察者使用
     */
    public void notifyObservers(Object arg) {

        Object[] arrLocal;

        synchronized (this) {
            if (!changed)
                return;
            arrLocal = observers.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length - 1; i >= 0; i--)
            ((MyObserver) arrLocal[i]).update(this, arg);
    }

    protected synchronized void clearChanged() {
        changed = false;
    }

    public synchronized boolean hasChanged() {
        return changed;
    }

    /**
     * 
     */
    public void doBusiness(String business) {
        if (true) {
            this.setChanged();
        }
        notifyObservers("现在还没有的参数");
    }
}
