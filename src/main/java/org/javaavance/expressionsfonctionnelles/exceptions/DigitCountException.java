package org.javaavance.expressionsfonctionnelles.exceptions;

public class DigitCountException extends CustomException {
    public DigitCountException(String pwd) {
        super("Le mot de passe " + pwd + " doit contenir au moins 2 chiffres.");
    }
}
