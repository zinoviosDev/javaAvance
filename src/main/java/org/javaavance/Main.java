package org.javaavance;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Validez un mot de passe en respectant les conditions suivantes :
        // * minimum de taille 8
        // * contient des lettres minuscules et majuscules
        // * contient au minimum 2 nombres
        // pour chaque condition non respectée, lancez l'exception qui lui correspond
        // => gérez les exceptions

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("enter a password : ");
            String password = scanner.nextLine();

            try {
                validatePassword(password);
                System.out.println("valid password");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void validatePassword(String password) throws Exception {
        if(password == null || password.length() < 8);
    }

    @Contract(pure = true)
    public static @NotNull String quiz() {
        try {
            return "try";
        }
        catch(Exception e) {
            return "catch";
        }
        finally {
            return "finally";
        }
    }
}
