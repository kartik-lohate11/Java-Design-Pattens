package org.example.design.factory;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getInstant(Department.DEVELOPMENT);
        employee.department();
    }
}
