package com.sangamclub.Assignment1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by User on 12/23/2014.
 */
// WRITE A PROGRAM THAT DISPLAYS THE CURRENT TIME IN GMT FORMAT. i.e. hour:minute:second.
public class Qusetion16 {
    public static void main(String[] args){
        //Date will return local time in Java
        Date localTime = new Date();

        //creating DateFormat for converting time from local timezone to GMT
        DateFormat convert = new SimpleDateFormat("HH:mm:ss");

        //getting GMT timezone
        convert.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.println("Local time : " + localTime);;
        System.out.println("Time in GMT : " + convert.format(localTime));

    }
}
