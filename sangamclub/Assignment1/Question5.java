package com.sangamclub.Assignment1;

/**
 * Created by User on 12/22/2014.
 */
//Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour.
public class Question5{
    public static  void main(String[] args){
        int distance=14;
        int time_in_second=2730;
        float time_in_hour=(time_in_second/3600f);//changing second to hour.
        float KMspeedPerHour=distance/time_in_hour;
        float speedInMilesPerHour=KMspeedPerHour/1.6f;
        System.out.println("Average speed in miles per Hour="+ speedInMilesPerHour);
    }
}
