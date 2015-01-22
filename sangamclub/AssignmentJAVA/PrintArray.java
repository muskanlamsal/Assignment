package com.sangamclub.AssignmentJAVA;

/**
 * Created by User on 1/8/2015.
 */
public class PrintArray {
    public PrintArray(int[] input){
        for(int element:input){
            System.out.println(element);
        }}
    public PrintArray(char[] input){
        for(char element:input){
            System.out.println(element);
        }}
    public PrintArray(double[] input){
        for(double element:input){
            System.out.println(element);
        }}
    public static void main(String[] args) {
        int[] intArray={5,6,7,8,9};
        double[] doubleArray={5.5,6.6,7.7,8.8,9.9};
        char[] charArray={'M','U','S','K','A','N'};
        System.out.println("Elements of intArray:");
        PrintArray a=new PrintArray(intArray);
        System.out.println("Elements of doubleArray:");
        PrintArray b=new PrintArray(doubleArray);
        System.out.println("Elements of charArray:");
        PrintArray c=new PrintArray(charArray);
    }
}
