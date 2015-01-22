package com.sangamclub.Assignment2;

/**
 * Created by User on 1/8/2015.
 */
public class BankAccount {
    public static void main(String[] args){
        BankAccount acct=new BankAccount();
        double result = acct.computeInterest(42);
        System.out.println(result);
    }

    private static double computeInterest(int rate) {
        float p=rate*10;
        return p;
    }


}
