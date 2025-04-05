package com.bridgelabz.AdvancedProblems;

import org.junit.jupiter.api.*;
public class BankAccountTest {
    private BankAccount account;
    @BeforeEach
    void setup() {
        account = new BankAccount(1000.0);
    }

    @Test
    public void shouldIncreaseBalanceWhenDepositMade() {
        account.deposit(500.0);
        Assertions.assertEquals(1500.0, account.getBalance());
    }

    @Test
    public void shouldDecreaseBalanceWhenWithdrawalMade() {
        account.withdraw(300.0);
        Assertions.assertEquals(700.0, account.getBalance());
    }

    @Test
    public void shouldThrowExceptionForInsufficientFunds() {
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            account.withdraw(2000.0);
        });
    }

    @Test
    public void shouldReturnCorrectInitialBalance() {
        Assertions.assertEquals(1000.0, account.getBalance());
    }
}

