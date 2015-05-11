/* 
 * @(#)MediatorImpl.java    Created on 2013-7-10
 * Copyright (c) 2013 Guomi. All rights reserved.
 */
package com.guomi.demo.pattern.mediator;

/**
 * @author Robin
 */
public class MediatorImpl extends Mediator {
    private Dog dog;

    private Sheep sheep;

    public MediatorImpl() {
        dog = new Dog();
        sheep = new Sheep();
    }

    @Override
    public void notice(String food) {
        if (food.equals("bone")) {
            dog.eat();
        }
        if (food.equals("grass")) {
            sheep.eat();
        }
    }

}
