package org.javaavance.expressionsfonctionnelles;

import org.javaavance.expressionsfonctionnelles.exceptions.CustomException;
import org.javaavance.expressionsfonctionnelles.validators.PasswordValidator;

public class Main {

    public static void main(String[] args) {
        try {
            PasswordValidator.validatePassword(null);
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
        try {
            PasswordValidator.validatePassword("weak123");
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            PasswordValidator.validatePassword("StrongPwd5");
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            PasswordValidator.validatePassword("StrongPwd45");
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}
