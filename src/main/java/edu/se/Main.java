package edu.se;

public class Main {
    public static void main(String[] args) {
        AccountService Control = new AccountService();
        Account newAccount = Control.createAccount("Checking", "Andrew Maher", 100.00);
        System.out.println(newAccount);
    }
}
