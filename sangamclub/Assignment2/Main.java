package com.sangamclub.Assignment2;

/**
 * Created by User on 1/8/2015.
 */
class Author {

    private String name;
    private String email;

    public Author()
    {
        System.out.println("This is empty constructor");
    }

    public Author(String name, String email)
    {
        System.out.println("This is not empty");
        this.name = name ;
        this.email = email;
    }

    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }


    public String toString()
    {
        return ("Name: " + name + "  Email : " + email);
    }
}



public class Main {

    public static void main(String[] args) {

        Author author = new Author("a", "b");
        author.setName("Shankar Koriala");
        author.setEmail("shankar@gmail.com");


        System.out.println(author.getName());  // value get
        System.out.println(author.getEmail());  // value get

        author.setName("Sanjeev");
        System.out.println(author.getName());  // value get







        Author author1 = new Author();
        author1.setName("Muscan Koriala");
        author1.setEmail("muscan@gmail.com");



        System.out.println(author1.getName());  // value get
        System.out.println(author1.getEmail());  // value get




        System.out.println("This is author " + author1);




    }
}