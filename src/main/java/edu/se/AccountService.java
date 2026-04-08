package edu.se;

import java.util.*;

public class AccountService {
    private ArrayList<Account> accounts = new ArrayList<>();

    public Account createAccount(String type, String name, double initialBalance) {
        Random rand = new Random();
        long n = rand.nextLong(1000000000000000L, 9999999999999999L); // Max 16 Digits
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == n) {
                i = 0; // reset loop
                n = rand.nextLong(1000000000000000L, 9999999999999999L); // Generate new ID
            }
        }
        Account newAccount = new Account(n, name, initialBalance, type);
        accounts.add(newAccount);
        return newAccount;
    }

    public Account updateAccount(Account account, String type, String name, double balance) {
        account.setBalance(balance);
        account.setType(type);
        account.setName(name);
        return account;
    }

    public Account getAccount(long accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                return accounts.get(i);
            }
        }
        return null;
    }
}

