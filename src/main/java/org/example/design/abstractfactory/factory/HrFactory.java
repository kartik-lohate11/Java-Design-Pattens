package org.example.design.abstractfactory.factory;

import org.example.design.abstractfactory.impl.Hr;
import org.example.design.factory.Employee;

public class HrFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createInstant() {
        return new Hr();
    }
}
