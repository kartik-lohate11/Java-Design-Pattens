package org.example.design.factory;

public class HrDep implements Employee{
    @Override
    public void department() {
        System.out.println("I am HR Dep");
    }
}
