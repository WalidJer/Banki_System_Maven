package com.keyin;

public class SavingAccount extends BankAccount{

    public SavingAccount(String accountHolder, int accountNumber, double balance){

        super(accountHolder, accountNumber, balance);

    }

    public void applyInterest(){
        double interestRate = 0.02;
        balance += balance* interestRate;

    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount){
            balance -=amount;
        }
    }
}
