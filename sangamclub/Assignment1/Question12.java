package com.sangamclub.Assignment1;

/**
 * Created by User on 12/23/2014.
 */
//the program to sum only the odd numbers from 1 to 100, and compute the average.
public class Question12 {
    public static void main(String[] args){
        int i=1,sum=0,count=0;
        while(i<=100){
            if(i%2!=0){
                sum=sum+i;
                count++;
            }
            i++;
        }
        System.out.println("The sum of odd numbers up to 100 is:"+ sum);
        float s=(float) sum;
        float avg=s/count;
        System.out.println("The average of odd numbers up to 100 is:"+ avg);
    }
}
