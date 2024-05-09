package javacode2;
import java.util.Scanner;
public class arrayinput {

	  public static void main(String[] args)   
	{  
	int n, sum =0;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the number of element ");  
	
	
	n=sc.nextInt();  
	
	int[] x= new int[10];  
	System.out.println("Enter the elements of the array");  
	for(int i=0; i<n; i++)  
	{  
	
	x[i]=sc.nextInt();  
	}  
	
	
	for (int i=0; i<n; i++)   
	{  
		sum=sum+x[i];
	}
	System.out.println("sum of array" + sum);  
	
	  
	}  
	}  
	

