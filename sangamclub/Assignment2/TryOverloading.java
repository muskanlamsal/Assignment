package com.sangamclub.Assignment2;

/**
 * Created by User on 1/8/2015.
 */
public class TryOverloading {
    private static void printArray(int[] Array) {
        for(int elememt: Array){
            System.out.println(elememt);
        }}
    private static void printArray(double[] Array) {
        for(double elememt: Array){
            System.out.println(elememt);
        }}
    private static void printArray(char[] Array) {
        for(char elememt: Array){
            System.out.println(elememt);
        }}
    public static void main(String[] args){
        int[] intArray={1,2,3,4,5};
        double[] doubleArray={1.1,2.2,3.3,4.4,5.5};
        char[] charArray={'M','U','S','K','A','N'};
        System.out.println("The element in intArray are:");
        printArray(intArray);
        System.out.println("The element in doubleArray are:");
        printArray(doubleArray);
        System.out.println("The element in charArray are:");
        printArray(charArray);
    }



}
