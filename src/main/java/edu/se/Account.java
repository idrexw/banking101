package edu.se;

public class Account {
    private long accountNumber;
    private String accountHolder;
    private double balance;
    public String accountType;

    public Account(long id, String s, double bal, String s2) {
        this.accountNumber = id;
        this.accountHolder = s;
        this.balance = bal;
        this.accountType = s2;
    };

    public long getAccountNumber() {
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
        return "Account Num: " + this.accountNumber + "\nName: " + this.accountHolder + "\nCurrent Balance: " + this.balance + "\nType: " + this.accountType;
    }
}
