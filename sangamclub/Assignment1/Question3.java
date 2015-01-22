package com.sangamclub.Assignment1;

/**
 * Created by User on 12/22/2014.
 */
//Write a program that displays the area and perimeter of a circle that has a radius of 5.5
public class Question3 {
    public static void  main(String[] args){
        float radius=5.5f;
        float p=3.1416f;
        float perimeter=2*radius*p;
        float area=radius*radius*p;
        System.out.println("Perimeter="+perimeter);
        System.out.println("Area="+area);
    }
}
