package com.sangamclub.AssignmentJAVA;

import java.util.Scanner;

/**
 * Created by User on 1/8/2015.
 */
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Conversion con=new Conversion();
        System.out.println("Enter the temperature in Fahrenheit:");
        con.fahrenheit=input.nextFloat();
        System.out.println("Enter the temperature in celsius:");
        con.celsius=input.nextFloat();
        System.out.println("F-->C="+con.F2C());
        System.out.println("C-->F="+con.C2F());

    }
}
class Conversion{
    float fahrenheit;
    float celsius;

    float F2C(){

        float FT=(fahrenheit - 32) * 5/9;
        return FT;
        }
    float C2F(){
        float CT= ((9 / 5) * celsius) + 32;
        return CT;
    }
}
