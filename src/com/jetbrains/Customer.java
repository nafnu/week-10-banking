package com.jetbrains;

public class Customer extends Bank{

    //properties of the object
    String firstName;
    String lastName;
    String idAccount;
    int customerPin;

    //the constructor
    public Customer(String f, String l, String iA, int cp) {
        this.firstName= f;
        this.lastName = l;
        this.idAccount = iA;
        this.customerPin = cp;

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getIdAccount() {
        return idAccount;
    }
    public int getCustomerPin() {
        return customerPin;
    }
}
