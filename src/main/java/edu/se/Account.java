package edu.se;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    public String accountType;

    public Account(int id, String s, double bal, String s2) {
        this.accountNumber = id;
        this.accountHolder = s;
        this.balance = bal;
        this.accountType = s2;
    };

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.accountHolder = name;
    }

    public void setBalance(double x) {
        this.balance = x;
    }

    public void setType(String t) {
        this.accountType = t;
    }

    @Override
    public String toString() {
        return "Account Num:" + this.accountNumber + ", Name: " + this.accountHolder + ", Current Balance: " + this.balance + ", Type: " + this.accountType;
    }
}
