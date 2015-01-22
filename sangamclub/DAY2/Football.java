package com.sangamclub.DAY2;

/**
 * Created by User on 12/27/2014.
 */
public class Football {
    int size;
    String color;
    String brand;
    int price;


    public String showFootball(){
        String fType="";
        if(brand.equals("NIKE")){
            fType="good";
        }
        return fType;
    }

}
class Datacable{
    int length;
    String color;
    String brand;
    int price;
}
class Teacher{
    String name;
    String qualification;
    String gender;
    int salary;
    Face teacherFace;
}
class Facebook{
    int friends;
    int followers;
    int family_member;
}

