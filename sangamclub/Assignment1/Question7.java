package com.sangamclub.Assignment1;

/**
 * Created by User on 12/22/2014.
 */
/*Write a program to Check Odd and Even which prints "ODD"
// if the int variable “number” is odd, or “Even Number” otherwise.*/
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }
    }
}
