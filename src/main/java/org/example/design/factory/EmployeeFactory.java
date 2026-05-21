package org.example.design.factory;

public class EmployeeFactory {
    public static Employee getInstant(Department dep) {

        switch (dep) {
            case HR:
                return new HrDep();
            case DEVELOPMENT:
                return new DevelopmentDep();
            case QA:
                return new QaDep();
            default:
                throw new RuntimeException("Invalid Dep Object Creation");
        }

    }
}
