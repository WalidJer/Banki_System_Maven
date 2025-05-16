package com.keyin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {
    SavingAccount account = new SavingAccount("Walid",123,100);

    @Test
    public void testDeposit(){



        account.deposit(50);

        Assertions.assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw(){


        account.withdraw(40);

        Assertions.assertEquals(60, account.getBalance());
    }

    @Test
    public void testWithdrawMoreThanBalance(){

        account.withdraw(200);
        Assertions.assertEquals(100,account.getBalance());

    }

    @Test
    public void testApplyInterest(){
        account.applyInterest();

        Assertions.assertEquals(102,account.getBalance(),0.001);
    }

}
