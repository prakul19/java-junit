package com.bridgelabz.AdvancedProblems;
import org.junit.jupiter.api.*;
public class UserRegistrationTest {
    private UserRegistration userRegistration;
    @BeforeEach
    void setup() {
        userRegistration = new UserRegistration();
    }
    @Test
    public void shouldRegisterUserSuccessfullyWithValidDetails() {
        String result = userRegistration.registerUser("prakul", "prakulagarwal@gmail.com", "password123");
        Assertions.assertEquals("User registered successfully", result);
    }
    @Test
    public void shouldThrowExceptionForEmptyUsername(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            userRegistration.registerUser("", "prakul@example.com", "password123");
        });
    }
    @Test
    public void shouldThrowExceptionForInvalidEmail() {
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            userRegistration.registerUser("prakul", "prakul.com", "password123");
        });
    }
    @Test
    public void shouldThrowExceptionForShortPassword() {
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            userRegistration.registerUser("prakul", "prakul@example.com", "123");
        });
    }
}

