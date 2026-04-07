package edu.se;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private List<Account> accounts = new ArrayList<>();

    public Account createAccount(String type, String name, double initialBalance) {
        Account newAccount = new Account(type, name, initialBalance);
    }
    }

