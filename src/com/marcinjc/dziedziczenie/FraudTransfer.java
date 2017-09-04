package com.marcinjc.dziedziczenie;

import java.math.BigDecimal;

public class FraudTransfer extends Transfer {
    public void transferMoney(BankAccount source, BankAccount destination, BigDecimal amount) {
        destination.deposit(amount);
    }
}
