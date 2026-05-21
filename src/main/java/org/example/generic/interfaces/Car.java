package org.example.generic.interfaces;

@FunctionalInterface
public interface Car {
    void run();

    default void execute() {
        System.out.println("i am default method");
    }

    static void process(){
        System.out.println("i am Static method");
    }
}
