package org.javaavance.expressionsfonctionnelles.interfaces;

import org.javaavance.expressionsfonctionnelles.exceptions.CustomException;

@FunctionalInterface
public interface Validator<T> {
    boolean checkRule(T t) throws CustomException;
}
