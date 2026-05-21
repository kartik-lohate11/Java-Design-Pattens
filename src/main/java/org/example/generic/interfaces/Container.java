package org.example.generic.interfaces;

public interface Container<T> {
    T get();
    void view(T element);
}
