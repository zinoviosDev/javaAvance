package org.javaavance.generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class GenericSet<T extends Comparable<T>> implements IGenericSet<T> {
    private T[] array;
    private int cursor;

    public GenericSet(int length) {
        array = (T[]) new Object[length];
    }

    @Override
    public void add(T item) {
        // si cursor == taille du tableau --> ArrayOfBoundException
        // cas nominal: ajouter un item à l'emplacement disponible et incrémenter l'indice

    }

    @Override
    public void remove(T item) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(T item) {
        for (T element : array) {
            if (element != null && element.compareTo(item) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void print() {

    }
}
