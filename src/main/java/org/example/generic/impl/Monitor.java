package org.example.generic.impl;

public class Monitor {

    public <T> Monitor(T t) {
        System.out.println(t.getClass().getName());
    }

    public <T, J, K> void fun(T t, J j, K k) {
        System.out.println(" T = " + t.getClass().getTypeName() +
                " J = " + j.getClass().getTypeName() + " and K = " + k.getClass().getTypeName());
    }
}
