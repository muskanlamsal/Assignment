package com.sangamclub.Assignment3;

/**
 * Created by User on 1/8/2015.
 */
class Circle {
    private double radius;
    private String color;

    Circle(){
        radius=1.0;
        color="red";
    }
    Circle(double radius){
        this.radius=radius;
        color="red";
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString(){
        return ("CIRCLE: Radius:"+ radius+"  Color:"+color);
    }
}
public class TestCircle{
    public static void main(String[] args) {
        Circle circle1=new Circle();
        System.out.println("Circle1-->RADIUS:" + circle1.getRadius() + "   AREA: " + circle1.getArea()+"  COLOR:"+circle1.getColor());
        Circle circle2=new Circle(2.0);
        System.out.println("Circle2-->RADIUS:" + circle2.getRadius() + "   AREA: " + circle2.getArea()+"  COLOR:"+circle2.getColor());
        Circle circle3=new Circle();
        circle3.setRadius(3);
        circle3.setColor("green");
        System.out.println("Circle3-->RADIUS:" + circle3.getRadius() + "   AREA: " + circle3.getArea()+"  COLOR:"+circle3.getColor());
        Circle circle4=new Circle();
        circle4.setRadius(4);
        circle4.setColor("black");
        System.out.println(circle4);
        Circle circle5=new Circle(1.2);
        System.out.println(circle5);
    }

}
