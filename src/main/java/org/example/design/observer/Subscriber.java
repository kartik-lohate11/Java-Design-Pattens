package org.example.design.observer;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println("Hi " + name + " New Video is Uploaded....");
    }
}
