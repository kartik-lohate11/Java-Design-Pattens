package org.example.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Observer> users = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        users.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void alert() {
        for (Observer observer : users) {
            observer.notified();
        }
    }
}
