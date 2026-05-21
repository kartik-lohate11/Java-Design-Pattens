package org.example.design.singleton;

import java.io.Serializable;

public class SingletonExp implements Serializable, Cloneable {
    private volatile static SingletonExp singletonExp;

    private SingletonExp() {
        if (singletonExp != null) {
            throw new RuntimeException("You can't create Object");
        }
    }

    public static SingletonExp getInstant() {
        if (singletonExp == null) {
            synchronized (SingletonExp.class) {
                if (singletonExp == null) {
                    singletonExp = new SingletonExp();
                }
            }
        }
        return singletonExp;
    }

    public void print() {
        System.out.println("I am Object of Singleton " + singletonExp.hashCode());
    }

    public Object readReObject() {
        return singletonExp;
    }

    @Override
    public Object clone() {
        return singletonExp;
    }
}
