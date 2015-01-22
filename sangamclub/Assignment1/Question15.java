package com.sangamclub.Assignment1;

/**
 * Created by User on 12/23/2014.
 */
//Write a program that converts a Fahrenheit degree to Celsius using the formula Celsius = (5/9)(Fahrenheit - 32).
import java.util.Scanner;
public class Question15 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit scale:");
        float Fahrenheit=scan.nextFloat();
        float Celsius=(5f/9f)*(Fahrenheit-32f);
        System.out.println("The corresponding temperature in Celsius scale is:"+ Celsius);
    }
}

