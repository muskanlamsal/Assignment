package com.sangamclub.Assignment1;

/**
 * Created by User on 12/22/2014.
 */
/*Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to an upperbound (e.g., 100).
Also compute and display the average*/
import java.util.Scanner;
public class Question10_11 {
    public static void main(String[] args){
        int n,i=1,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number :");
        n=input.nextInt();
        do
        {
            sum=sum+i;
            i +=1;
        }   while(i<=n);
        float s=(float) sum;
        float avg=s/n;
        System.out.println("Using Do-While");
        System.out.println("The sum is:"+sum);
        System.out.println("The average is:"+ avg);

        while(i<=n){
            sum=sum+i;
            i++;
        }


        System.out.println("Using While");
        System.out.println("The sum is:"+sum);
        System.out.println("The average is:"+ avg);
        sum=0;
        for( i=1; i<=n;i++){
            sum=sum+i;
        }


        System.out.println("Using For");
        System.out.println("The sum is:"+sum);
        System.out.println("The average is:"+ avg);


    }
}

