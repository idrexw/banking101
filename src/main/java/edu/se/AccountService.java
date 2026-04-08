package edu.se;

import java.util.*;

public class AccountService {
    private ArrayList<Account> accounts = new ArrayList<>();

    public Account createAccount(String type, String name, double initialBalance) {
        Random rand = new Random();
        int n = rand.nextInt(1000000000000000, 9999999999999999) // Max 16 Digits
        for (int i = 0; i < accounts.length; i++) {
            if (accounts.get(i).getAccountNumber == n) {
                i = 0; // reset loop
                n = rand.nextInt(1000000000000000, 9999999999999999) // Generate new ID
            }
        }
        Account newAccount = new Account(n, type, name, initialBalance);
        accounts.add(newAccount);
    }

    public Account updateAccount(Account account, String type, String name, double balance)
        account.setBalance(balance);
        account.setType(type);
        account.setName(name);
    }

