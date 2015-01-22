package com.sangamclub;

/**
 * Created by User on 12/21/2014.
 */
import java.util.Scanner;
public class ScanStringArray {
    public static void main(String[] args){
        String[] array=new String[5];
        Scanner scan= new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the name:");
            array[i]=scan.nextLine();
        }
        System.out.println("The name you entered:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
