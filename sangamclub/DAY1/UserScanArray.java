package com.sangamclub;

/**
 * Created by User on 12/21/2014.
 */
import java.util.Scanner;
public class UserScanArray {
    public static void main(String[] args){
        int [] array= new int[10];
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers do you want??");
        int choice=scan.nextInt();
        for(int i=0;i<choice;i++){
            System.out.println("Enter the number:");
            array[i]=scan.nextInt();
        }
        System.out.println("The numbers you entered:");
        for(int i=0;i<choice;i++){
            System.out.println(array[i]);
        }
    }
}
