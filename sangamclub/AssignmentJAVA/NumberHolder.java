package com.sangamclub.AssignmentJAVA;

/**
 * Created by User on 1/8/2015.
 */
public class NumberHolder {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        NumberHolder num=new NumberHolder();
        num.anInt=9;
        num.aFloat= (float) 1.2;
        System.out.println(num.anInt+" ,"+ num.aFloat);

    }
}
