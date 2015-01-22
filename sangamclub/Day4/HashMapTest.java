package com.sangamclub.Day4;

import java.util.*;

/**
 * Created by User on 1/10/2015.
 */
public class HashMapTest {
    public static void main(String[] args) {
        List<String> string1= new LinkedList<String>();
        string1.add("A");
        string1.add("B");
        string1.add("C");

        List<String> string2=new LinkedList<String>();
        string1.add("a");
        string1.add("b");
        string1.add("c");

        HashMap<String,List<String>> map1= new HashMap<String, List<String>>();
       map1.put("e",string1);
        map1.put("f",string2);

        for(String key: map1.keySet())
        {
            for (String value : map1.get(key)){
                System.out.println(value);
            }

            System.out.println(" ");
        }



       /* HashMap< String,String> map=new HashMap<String, String>();



        map.put("a","MESSI");
        map.put("b","CR7");



        for (String a : map.keySet()){
            System.out.println(map.get(a));
        }




        //for (Object key: map.keySet())
          //  System.out.println(map.get(key));


       *//* for(Map.Entry<String, List<String>> entry : map.entrySet()){
            String key=entry.getKey();

        }*/

    }
}
