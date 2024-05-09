package javacode2;


	import java.io.*;
	import java.util.Scanner;
	 
	public class reverse_string {

	    public static void main (String[] args) {
	       
	        String str, nstr="";
	        char ch;
	        Scanner sc= new Scanner(System.in);
	      System.out.println("Enter the string");
	       str= sc.nextLine();              //reads string   
            System.out.print("You have entered: "+str);       //Example word
	        
            for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i);
	        nstr= ch+nstr; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
	}