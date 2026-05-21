package org.example.generic.impl;

import org.example.generic.interfaces.Car;

public class CarImpl implements Car {
    public static void main(String[] args) {

        Car car = () -> System.out.println("i am lambda car");

        car.run();

    }

    @Override
    public void run() {
        System.out.println("I am run");
    }
}
