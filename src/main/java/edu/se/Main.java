package edu.se;

public class Main {
    public static void main() {
        AccountService Control = new accountService();
        Control.createAccount("Checking", "Andrew Maher", 100.00);
        System.out.println(Control.accounts.get(0).toString());
    }
}
