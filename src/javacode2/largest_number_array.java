package javacode2;

import java.util.Scanner;

public class largest_number_array
{

	
	    public static void main(String[] args) 
	    {  
	  
	       
	    	int max=0;
	    	Scanner sc=new Scanner(System.in);  
	    	System.out.print("Enter the number of element ");  
	    	
	    	
	    	int n=sc.nextInt();  
	    	
	    	int[] x= new int[10];  
	    	System.out.println("Enter the elements of the array");  
	    	for(int i=0; i<n; i++)  
	    	{  
	    	
	    	x[i]=sc.nextInt();  
	    	}  
	    	

	     
	        for (int i = 0; i < x.length; i++)
	        {  
	           if(x[i] > max)  
	               max = x[i];  
	        }  
	        System.out.println("Largest element in array: " + max);  
	    } 
}
