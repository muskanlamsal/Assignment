package com.sangamclub.Assignment2;

import java.util.Scanner;

/**
 * Created by User on 1/8/2015.
 */
public class Temprature {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        Conversion con=new Conversion();
        System.out.println("Enter the temperature in Fahrenheit:");
        con.Fahrenheit=input.nextFloat();
        System.out.println("Enter the temperature in Celcius:");
        con.Celsius=input.nextFloat();
        System.out.println("F-->C="+con.F2C());
        System.out.println("C-->F="+con.C2F());
    }
    }
class Conversion{
    float Fahrenheit;
    float Celsius;
      float F2C() {
          float FT = (Fahrenheit - 32) * 5 / 9;
          return FT;
      }
    float C2F(){
         float CT = 9*(Celsius/5 )+ 32;
        return CT;
    }


}

