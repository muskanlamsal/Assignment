package com.sangamclub.Assignment2;

/**
 * Created by User on 1/8/2015.
 */
public class SomethingIsWrong {

        public static void main(String[] args) {
            Rectangle myRect= new Rectangle();
            myRect.width = 40;
            myRect.height = 50;
            System.out.println("myRect's area is " + myRect.area());
        }
    }
class Rectangle{
    float width;
    float height;

    public float area() {
        float Area= width * height;
        return Area;
    }
}
