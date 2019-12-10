package org.framework.pratice.designpattern.abstractfactory;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}