package com.sangamclub;

/**
 * Created by User on 12/21/2014.
 */
import java.util.Scanner;
public class Scan {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner input = new Scanner (System.in);
        int number=input.nextInt();

        System.out.println("The number you entered is" +" "+ number);
    }

}
