package com.bridgelabz.AdvancedProblems;
import org.junit.jupiter.api.*;

public class PasswordValidatorTest {
    private PasswordValidator validator;
    @BeforeEach
    void setup() {
        validator = new PasswordValidator();
    }
    @Test
    public void shouldReturnTrueForValidPassword() {
        Assertions.assertTrue(validator.isValid("Password1"));
    }
    @Test
    public void shouldFailIfPasswordIsTooShort() {
        Assertions.assertFalse(validator.isValid("Pass1"));
    }
    @Test
    public void shouldFailIfNoUppercaseLetter() {
        Assertions.assertFalse(validator.isValid("password1"));
    }
    @Test
    public void shouldFailIfNoDigitPresent() {
        Assertions.assertFalse(validator.isValid("Password"));
    }
    @Test
    public void shouldFailIfPasswordIsNull() {
        Assertions.assertFalse(validator.isValid(null));
    }
}

