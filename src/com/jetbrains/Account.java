package com.jetbrains;

public abstract class Account {

    //properties of the object
    String accountNumber;
    String balance;
    String amount;


    //the constructor
    public Account(String ac, String b, String am) {
        this.accountNumber= ac;
        this.balance = b;
        this.amount = am;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getBalance() {
        return balance;
    }
    public String getAmount() {
        return amount;
    }


}
