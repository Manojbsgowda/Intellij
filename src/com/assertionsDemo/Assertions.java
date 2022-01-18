package com.assertionsDemo;

public class Assertions {
    public static void main(String[] args) {
        int balance = 100;
        int withdrawal_amt = 200;

        assert (balance > withdrawal_amt): "withdrawal amount should be greater than the balance";
    }



}
