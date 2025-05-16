package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckingAccountTest {
    CheckingAccount account = new CheckingAccount("John", 456, 200);

    @Test
    public void testDeposit(){
        account.deposit(100);
        Assertions.assertEquals(300, account.getBalance());
    }

    @Test
    public void testWithdrawWithinBalance() {
        CheckingAccount account = new CheckingAccount("Bob", 456, 200);
        account.withdraw(150);
        Assertions.assertEquals(50, account.getBalance());
    }

    @Test
    public void testWithdrawWithinOverdraft() {
        CheckingAccount account = new CheckingAccount("Bob", 456, 100);
        account.withdraw(180); // 100 + 100 overdraft is okay
        Assertions.assertEquals(-80, account.getBalance());
    }

    @Test
    public void testWithdrawExceedsOverdraft() {
        CheckingAccount account = new CheckingAccount("Bob", 456, 100);
        account.withdraw(250); // 100 + 100 overdraft is NOT enough
        Assertions.assertEquals(100, account.getBalance()); // should not allow the withdrawal
    }

}
