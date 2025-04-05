package com.bridgelabz.AdvancedProblems;
import java.util.regex.Pattern;
public class UserRegistration {
    public String registerUser(String username, String email, String password) {
        if (username==null||username.trim().isEmpty()){
            throw new IllegalArgumentException("Username is required");
        }
        if (email==null||!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (password==null ||password.length() <6) {
            throw new IllegalArgumentException("Password must be at least 6 characters long");
        }
        return "User registered successfully";
    }
    private boolean isValidEmail(String email) {
        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$", email);
    }
}

