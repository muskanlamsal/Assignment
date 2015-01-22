package com.sangamclub.Assignment2;

/**
 * Created by User on 1/8/2015.
 */
import java.awt.*;
public class Point {
    int x; // Each Point object has
    int y; // an int x and y inside.


    public void draw(Graphics g) {// draws this point
        Point p1=new Point();
        g.fillOval(p1.x, p1.y, 3, 3);
        g.drawString("(" + p1.x + ", " + p1.y + ")", p1.x, p1.y);
    }
    public void translate(int dx, int dy) {// Shifts this point's x/y
        int x=1;
         x = x + dx; // by the given amounts.
        int y =1;
        y= y + dy;
    }
    public double distanceFromOrigin() { // Returns this point's
        Point p = new Point(); // distance from (0, 0).
        double dist = Math.sqrt(p.x * p.x + p.y * p.y);
        return dist;
    }
}

