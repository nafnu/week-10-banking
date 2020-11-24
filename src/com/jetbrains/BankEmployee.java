package com.jetbrains;

public class BankEmployee extends Bank{

    //properties of the object
    String IDemployee;
    String Epin;

    //the constructor
    public BankEmployee(String d, String e) {
        this.IDemployee= d;
        this.Epin = e;

    }

    public String getIDemployee() {
        return IDemployee;
    }
    public String getEpin() {
        return Epin;
    }
}
