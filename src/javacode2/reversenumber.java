package javacode2;

import java.util.Scanner;

public class reversenumber {

	  
	public static void main(String[] args)   
	{  
	int number, reverse = 0;  
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		     number = sc.nextInt();
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	}  