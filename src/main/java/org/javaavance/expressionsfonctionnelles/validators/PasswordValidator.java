package org.javaavance.expressionsfonctionnelles.validators;

import org.javaavance.expressionsfonctionnelles.exceptions.CustomException;
import org.javaavance.expressionsfonctionnelles.exceptions.DigitCountException;
import org.javaavance.expressionsfonctionnelles.exceptions.LengthException;
import org.javaavance.expressionsfonctionnelles.exceptions.LetterCaseException;
import org.javaavance.expressionsfonctionnelles.interfaces.Validator;

import java.util.function.Consumer;

public class PasswordValidator<T> extends BaseValidator<T> {

    public PasswordValidator(Validator<T> validator) {
        super(validator);
    }

    // Minimum de taille 8
    static Validator<String> lengthValidator = (pwd) -> {
        if (pwd == null || pwd.length() < 8) throw new LengthException(pwd);
        return true;
    };

    // Contient des lettres minuscules et majuscules
    static Validator<String> caseValidator = (pwd) -> {
        if (!pwd.matches("^(?=.*[a-z])(?=.*[A-Z]).+$")) throw new LetterCaseException(pwd);
        return true;
    };

    // Contient au minimum 2 nombres
    static Validator<String> digitValidator = (pwd) -> {
        long count = pwd.chars().filter(Character::isDigit).count();
        if (count < 2) throw new DigitCountException(pwd);
        return true;
    };

    static BaseValidator<String> passwordValidator
            = new BaseValidator<String>(lengthValidator).andThen(caseValidator).andThen(digitValidator);

    public static void validatePassword(String pwd) throws CustomException {
        passwordValidator.checkRule(pwd);
        System.out.println("Le mot de passe " + pwd + " est valide.");
    }
}
