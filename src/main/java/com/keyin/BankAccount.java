package com.keyin;

public abstract class BankAccount {
    protected String accountHolder;
    protected int accountNumber;
    protected double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance+= amount;
        }
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance;
    }
}
