package com.sangamclub.Assignment1;

/**
 * Created by User on 12/22/2014.
 */
/*Write a program  to check if the Student is Pass or Fail which prints "PASS" if the
int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.*/
 import java.util.Scanner;
public class Question6 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the marks of the students:");
        int marks=scan.nextInt();
        if(marks>=50){
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}
