package com.sangamclub.Assignment2;

/**
 * Created by User on 1/8/2015.
 */
public class NumberHolder {

        public int anInt;
        public float aFloat;
    public static void main(String[] args){
        NumberHolder n1=new NumberHolder();
        n1.aFloat=10;
        n1.anInt=9;
        System.out.println("The value of anInt and aFloat is "+n1.anInt+","+n1.aFloat);
    }

}
