package org.javaavance.expressionsfonctionnelles.exceptions;

public class LengthException extends CustomException {
    public LengthException(String pwd) {
        super("Le mot de passe " + pwd + " doit avoir une longueur minimale de 8 caractères.");
    }
}
