package com.marcinjc.dziedziczenie;

import java.math.BigDecimal;

public interface BankAccount {
    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);
}
