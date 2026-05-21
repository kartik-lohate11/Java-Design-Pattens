package org.example.design.abstractfactory.factory;

import org.example.design.abstractfactory.impl.Qa;
import org.example.design.factory.Employee;

public class QaFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createInstant() {
        return new Qa();
    }
}
