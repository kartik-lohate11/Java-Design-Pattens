package org.example.generic.impl;

import org.example.generic.interfaces.Container;

public class Component<T> implements Container<T> {

    private T element;

    @Override
    public T get() {
        return element;
    }

    @Override
    public void view(T element) {
        this.element = element;
    }
}
