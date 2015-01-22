package com.sangamclub.Assignment2;

/**
 * Created by User on 1/8/2015.
 */
public class ArrayOverloading {

        public static void printArray(int [] inputArray) {
            for (int element : inputArray){
                System.out.println(element);

            }
        }



        public static void printArray(double[] inputArray) {
            for (double element : inputArray){
                System.out.println(element);

            }
        }
        public static void printArray(char[] inputArray) {
            for (char element : inputArray){
                System.out.println(element);

            }
        }
        public static void main(String args[]) {


            int[] integerArray = { 1, 2, 3, 4, 5, 6 };
            double[] doubleArray = { 1.1, 2.2, 3.3, 4.4,
                    5.5, 6.6, 7.7 };
            char[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

            System.out.println("Array integerArray contains:");
            printArray(integerArray);
            System.out.println("\nArray doubleArray contains:");
            printArray(doubleArray);
            System.out.println("\nArray characterArray contains:");
            printArray(characterArray);
        }
    }

