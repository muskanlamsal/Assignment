package com.sangamclub.AssignmentJAVA;

/**
 * Created by User on 1/8/2015.
 */
public class AuthorOnly {
    public static void main(String[] args) {
        Author author=new Author("Muskan","sportmskn@gmail.com",'M');
        System.out.println(author);
        System.out.println("===USING GET===");
        System.out.println("NAME:"+author.getName()+" EMAIL:"+author.getEmail()+"  GENDER:"+ author.getGender());
        author.setEmail("mskn@google.com");
        System.out.println("===USING SET===");
        System.out.println("NAME:"+author.getName()+" EMAIL:"+author.getEmail()+"  GENDER:"+ author.getGender());

    }

}
class Author{
    private String name;
    private String email;
    private char gender;
    Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return ("Name=" + name + "  Email=" + email+"  Gender="+gender);

    }
}
