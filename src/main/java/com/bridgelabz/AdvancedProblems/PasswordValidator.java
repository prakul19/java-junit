package com.bridgelabz.AdvancedProblems;

public class PasswordValidator {
    public boolean isValid(String password) {
        if (password==null||password.length()<8)
            return false;
        boolean Uppercase = false;
        boolean Digit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) Uppercase = true;
            if (Character.isDigit(ch)) Digit = true;
        }
        return Uppercase && Digit;
    }
}
