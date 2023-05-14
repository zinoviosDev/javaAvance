package org.javaavance.expressionsfonctionnelles.exceptions;

public class LetterCaseException extends CustomException {
    public LetterCaseException(String pwd) {
        super("Le mot de passe " + pwd + " doit contenir des lettres minuscules et majuscules.");
    }
}
