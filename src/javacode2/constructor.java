package javacode2;

import java.io.*;

class cons{
    
    cons(String name)
    {
        System.out.println("Constructor with one " + "argument - String : " + name);
    }
 
    
    cons(String name, int age)
    {
 
        System.out.println(
            "Constructor with two arguments : " + " String and Integer : " + name + " " + age);
    }
 
   
    cons(long id)
    {
        System.out.println("Constructor with one argument : " + "Long : " + id);
    }
}
 
class constructor {
    public static void main(String[] args)
    {
        
        cons geek2 = new cons("gopal");
        cons geek3 = new cons("Ashish", 26);
        cons geek4 = new cons(325614567);
    }
}
