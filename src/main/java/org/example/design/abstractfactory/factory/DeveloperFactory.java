package org.example.design.abstractfactory.factory;

import org.example.design.abstractfactory.impl.Developer;
import org.example.design.factory.Employee;

public class DeveloperFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createInstant() {
        return new Developer();
    }
}
