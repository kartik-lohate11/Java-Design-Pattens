package org.example.design.abstractfactory.impl;

import org.example.design.factory.Employee;

public class Hr implements Employee {
    @Override
    public void department() {
        System.out.println("I am Hr");
    }
}
