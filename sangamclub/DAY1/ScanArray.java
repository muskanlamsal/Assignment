package com.sangamclub;

/**
 * Created by User on 12/21/2014.
 */
import java.util.Scanner;
public class ScanArray {
    public static void main(String[] args){
        int []array= new int[5];
        Scanner scan= new Scanner(System.in);
        for(int i=0;i< array.length; i++)
        {
            System.out.println("Enter the number:");
            array[i]=scan.nextInt();
        }
        System.out.println("The numbers you entered are:");
        for(int j=0;j<array.length;j++)
        {
            System.out.println(array[j]);
        }
    }
}
