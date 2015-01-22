package com.sangamclub.Assignment1;

/**
 * Created by User on 12/23/2014.
 */
/*
Write a program called Do..Re..Mi.. which prints the numbers 1 to 110, 11 numbers per line.
The program shall print "Do.." in place of the numbers which are multiples of 3,
"Ri.." for multiples of 5, "Mi.." for multiples of 7, "Do..Re..." for multiples of 3 and 5, and so on.
 */
public class Question14 {
    public static void main(String[] args){
        for(int i=1;i<=110;i++){

            if (i%3==0 && i%5==0 && i%7==0){
                System.out.println("Do..Ri..Mi.."+" ");
            }
            else if (i%3==0 && i%5==0){
                System.out.print("Do..Ri.."+ " ");
            }
            else if (i%5==0 && i%7==0){
                System.out.print("Ri..Mi.."+ " ");
            }
            else if (i%3==0 && i%7==0){
                System.out.print("Do..Mi.." + " ");
            }
            else if (i%3==0){
                System.out.print("Do.."+ " ");
            }
            else if (i%5==0){
                System.out.print("Ri.."+ " ");
            }
            else if (i%7==0){
                System.out.print("Mi.."+ " ");
            }

            else{
                System.out.print(i+" ");
            }
            if(i%11==0){
                System.out.print("\n");
            }
        }
    }
}
