package com.sangamclub.Assignment1;

/**
 * Created by User on 12/22/2014.
 */
//Write a program that displays the area and perimeter of a rectangle with the width of 4.5 and height of 7.9
public class Question4 {
    public  static void main(String[] args){
        float width=4.5f;
        float height=7.9f;
        float area=width*height;
        float perimeter=2*(width+height);
        System.out.println("Area of rectangle="+area);
        System.out.println("Perimeter of rectangle="+perimeter);

    }
}
