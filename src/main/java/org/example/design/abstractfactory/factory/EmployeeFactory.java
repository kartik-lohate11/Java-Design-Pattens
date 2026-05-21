package org.example.design.abstractfactory.factory;

import org.example.design.factory.Employee;

public class EmployeeFactory {
    public static Employee getInstant(EmployeeAbstractFactory employeeAbstractFactory) {
        return employeeAbstractFactory.createInstant();
    }
}
