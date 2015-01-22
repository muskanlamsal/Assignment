package com.sangamclub.Assignment1;

/**
 * Created by User on 12/22/2014.
 */
/*Write a program using both(SWITCH and IF..ELSE IF..ELSE) to Print a Day in Word,
which prints “Sunday”, “Monday”, ... “Saturday” if the int variable "day" is 0, 1, ..., 6, respectively.
Otherwise, it shall print “Not a valid day”.
 */
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scan.nextInt();
        switch (num){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
                break;

        }
        if(num==0)
        {
            System.out.println("Sunday");
        }
        else if (num==1){
            System.out.println("Monday");
        }
        else if (num==2){
            System.out.println("Tuesday");
        }
        else if (num==3){
            System.out.println("Wednesday");
        }
        else if (num==4){
            System.out.println("Thursday");
        }
        else if (num==5){
            System.out.println("Friday");
        }
        else if (num==6){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Not a valid day");
        }
    }
}
