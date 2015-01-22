package com.sangamclub.Assignment3;

/**
 * Created by User on 1/9/2015.
 */
class MyCircle{
    private int radius;
    private MyPoint centre;
    MyCircle(){

        centre = new MyPoint();
        centre.setXY(1,1);
        radius=1;
    }
    MyCircle(MyPoint centre,int radius){
        this.centre=centre;
        this.radius=radius;
    }
    MyCircle(int x, int y,int z){
        centre=new MyPoint();
        centre.setXY(x,y);
        radius=z;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCentre() {
        return centre;
    }

    public void setCentre(MyPoint centre) {
        this.centre = centre;
    }
    public String toString(){
        return ("Centre@"+centre+"  Radius="+radius);
    }
}

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle cir1=new MyCircle();
        System.out.println(cir1);
        MyPoint point=new MyPoint(2,2);

        MyCircle cir2=new MyCircle(point,3);
        System.out.println(cir2);
        MyCircle cir3=new MyCircle(4,4,4);
        System.out.println(cir3);





    }
}
