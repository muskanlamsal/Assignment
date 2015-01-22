package com.sangamclub;

/**
 * Created by User on 12/23/2014.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class LocalTimetoGMT {


    /**
     * Simple Java program to convert local time into GMT or any other TimeZone in Java
     * SimpleDateFormat in Java can be used to convert Date from one timezone to other
     * @author Javin
     */


        public static void main(String args[]) {

            //Date will return local time in Java
            Date localTime = new Date();

            //creating DateFormat for converting time from local timezone to GMT
            DateFormat converter = new SimpleDateFormat("HH:mm:ss");

            //getting GMT timezone, you can get any timezone e.g. UTC
            converter.setTimeZone(TimeZone.getTimeZone("GMT"));

            System.out.println("local time : " + localTime);;
            System.out.println("time in GMT : " + converter.format(localTime));

        }

    }

