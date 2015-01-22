package com.sangamclub.Day4;

/**
 * Created by User on 1/10/2015.
 */
public class TestInterface {
    public static void main(String[] args) {

        Me m = new Me();
        m.eat();
        m.travel();
//        System.out.println(m.noOfLegs());
        Person pp=new Person() {
            @Override
            public void eat() {
                System.out.println("Sandwich");
            }
            @Override
            public void travel() {
                System.out.println("Kathmandu");

            }
            public void eat(int a) {
                System.out.println("Sand");
            }
        };
        pp.eat(1);
    }

}

interface Person {

    public void eat();
    public void eat(int i);
    public void travel();
}
class Me implements Person{

    public void eat(){
        System.out.println("I eat burger.");
    }
public void eat(int ii){
        System.out.println("I eat burger.");
    }

    public void travel(){
        System.out.println("I travel to Pokhara");
    }

    public String noOfLegs(){
        return ("I have two legs.");
    }

}
