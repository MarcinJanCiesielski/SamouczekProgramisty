package com.marcinjc.dziedziczenie;

import java.math.BigDecimal;

public class Transfer {
    public void transferMoney(BankAccount source, BankAccount destination, BigDecimal amount) {
        source.withdraw(amount);
        destination.deposit(amount);
    }
}
