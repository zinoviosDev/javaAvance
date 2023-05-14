package org.javaavance.expressionsfonctionnelles.validators;

import org.javaavance.expressionsfonctionnelles.exceptions.CustomException;
import org.javaavance.expressionsfonctionnelles.interfaces.Validator;

public class BaseValidator<T> implements Validator<T> {

    private final Validator<T> validator;

    public BaseValidator(Validator<T> validator) {
        this.validator = validator;
    }

    @Override
    public boolean checkRule(T t) throws CustomException {
        validator.checkRule(t);
        return true;
    }

    public BaseValidator andThen(Validator<T> other) {
        Validator<T> combined = (T t) -> validator.checkRule(t) && other.checkRule(t);
        return new BaseValidator(combined);
    }
}
