package edu.se;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    public String accountType;

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
}
