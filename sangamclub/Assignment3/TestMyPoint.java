package com.sangamclub.Assignment3;

/**
 * Created by User on 1/9/2015.
 */
class MyPoint{
    private int x;
    private int y;
    MyPoint(){
        x=0;
        y=0;
    }
    MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return ("("+x+","+y+")");
    }
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y-y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(MyPoint another){
        int xDiff = this.x-another.x;
        int yDiff=this.y-another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

}

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5, 6));
        MyPoint[] points = new MyPoint[11];
        for(int i=1;i<points.length;i++){
            points[i] = new MyPoint(i,i);
            System.out.println(points[i]);
        }

    }
}
