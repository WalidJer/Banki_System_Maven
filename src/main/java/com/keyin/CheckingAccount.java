package com.keyin;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolder, int accountNumber, double balance){
        super(accountHolder, accountNumber, balance);

    }

    @Override
    public void withdraw(double amount) {
        double overdraftLimit = 100.0;
        if(amount > 0 && (balance + overdraftLimit) >= amount){
            balance -= amount;
        }
    }
}
