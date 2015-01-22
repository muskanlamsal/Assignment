package com.sangamclub.DAY3;

/**
 * Created by User on 1/3/2015.
 */
public class Example {
    public static void main(String[] args){
        System.out.println(Math.sqrt(4));
        System.out.println(Math.PI);
        System.out.println(isSuperCar());
    }

    static class Car{
        double speed;

    }
    static String isSuperCar() {

        Car isSuperCar = new Car();
        String x;
        isSuperCar.speed = 160;
        if (isSuperCar.speed > 120) {
            x = "WOW";
        } else x = "bad";

        return x;
    }

}
