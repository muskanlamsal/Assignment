package com.sangamclub;

/**
 * Created by User on 12/21/2014.
 */

import java.util.Scanner;
public class Scan2{
    public static void main(String[] args){
        System.out.println("Enter your favorite number");
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        System.out.println(num);
    }
}
