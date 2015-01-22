package com.sangamclub.Assignment1;

/**
 * Created by User on 12/22/2014.
 */
//Write the program to read three numbers from user and displays their average.
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args){
        System.out.println("Enter three numbers:");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        float avg=(num1+num2+num3)/3f;
        System.out.println("The average of numbers you entered is:"+ avg);

    }
}
