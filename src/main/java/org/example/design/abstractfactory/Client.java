package org.example.design.abstractfactory;

import org.example.design.abstractfactory.factory.DeveloperFactory;
import org.example.design.abstractfactory.factory.EmployeeFactory;
import org.example.design.abstractfactory.factory.QaFactory;
import org.example.design.factory.Employee;

import java.util.function.Consumer;

public class Client {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getInstant(new DeveloperFactory());
        employee.department();

        employee = EmployeeFactory.getInstant(new QaFactory());
        employee.department();

      }
}
