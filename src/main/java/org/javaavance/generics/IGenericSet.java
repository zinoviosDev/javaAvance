package org.javaavance.generics;

public interface IGenericSet<T extends Comparable<T>> {
    void add(T item);
    void remove(T item);
    T get(int index);
    void clear();
    boolean contains(T item);
    int getSize();
    void print();
}
