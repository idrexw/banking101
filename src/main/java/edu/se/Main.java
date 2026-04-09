package edu.se;

public class Main {
    public static void main(String[] args) {
        AccountService Control = new AccountService();
        Account newAccount = Control.createAccount("Checking", "Andrew Maher", 100.00);
        long newAccountNumber = newAccount.getAccountNumber();

        System.out.println("createAccount() functionality:");
        System.out.println(newAccount);

        Control.updateAccount(newAccountNumber, "Savings", "Andrew Maher", 500.00);
        System.out.println("updateAccount() functionality:")
        System.out.println(Control.getAccount(newAccountNumber));

        Control.deleteAccount(newAccount.getAccountNumber);
        System.out.println(Control.getAccount(newAccountNumber))
    }
}
