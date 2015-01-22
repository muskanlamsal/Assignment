package com.sangamclub.AssignmentJAVA;

/**
 * Created by User on 1/8/2015.
 */
public class AuthorAndBook {
    public static void main(String[] args) {
        Author anauthor=new Author("Muskan","sportymskn@gmail.com",'M');
        Book abook= new Book("BARCELONA",anauthor,90,9);
        System.out.println("BOOK NAME:"+abook.getName());
        System.out.println("BOOK PRICE:"+abook.getPrice());
        System.out.println("BOOK STOCK:"+abook.getQtyInstock());
        System.out.println("AUTHOR DETAILS:"+"\n"+anauthor);
    }

}
class Book{
    private String name;
    private Author author;
    private double price;
    private int qtyInstock;
    Book(String name,Author author,double price,int qtyInstock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInstock=qtyInstock;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQtyInstock(){
        return qtyInstock;
    }
}

