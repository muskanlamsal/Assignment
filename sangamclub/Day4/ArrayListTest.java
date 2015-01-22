package com.sangamclub.Day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by User on 1/10/2015.
 */
public class ArrayListTest {
    public static void main(String[] args) {


        List<String> fruits = new ArrayList<String>();




        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");



        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }

        fruits.remove(0);

        fruits.remove(0);


        for (String f  :fruits){
            System.out.println(f);
        }




       /* Iterator<String> fruitsIterator = fruits.iterator();
        while(fruitsIterator.hasNext()){
        String fur=fruitsIterator.next();
        System.out.println(fur);
        }
        fruits.remove(fruits.size()-1);
        Iterator<String> removeFruits = fruits.iterator();
        while(removeFruits.hasNext()){
            String fur=removeFruits.next();
            System.out.println(fur);
        }


       */ //List<String> lst=new List<String>() ;

}}
