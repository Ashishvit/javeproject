package javacode2;
import java.util.Scanner;  

public class prime {

		  public static void main(String[] args) {
		    // Input number
		    

		    int count = 0;

		    Scanner sc=new Scanner(System.in);  
			System.out.println("Enter the number of number ");  
			 int n=sc.nextInt(); 
			 
		    if (n <= 1) {
		      System.out.println("The number is not prime");
		      return;
		    }

		    for (int j = 1; j <= n / 2; j++) {
		      if (n % j == 0) {
		        count++;
		      }
		    }

		   
		    if (count > 1) {
		        System.out.println("The number is not prime");
		    }
		    else {
		      System.out.println("The number is prime");
		    }
		  }
		}