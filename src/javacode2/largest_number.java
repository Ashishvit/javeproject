package javacode2;

import java.util.Scanner;  
public class largest_number
{  
public static void main(String[] args)   
{  
int a, b, c, largest;  

Scanner sc = new Scanner(System.in);  

System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();  
largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b); 

System.out.println("The largest number is: "+largest);  
}  
}  

//public class LargestNumberExample3  
//{  
//public static void main(String[] args)   
//{  
////initializing numbers to compare  
//int a=40, b=78, c=19;  
////comparing numbers, a with b and a with c   
////if both conditions are true, prints a  
//if(a>=b && a>=c)  
//System.out.println(a+" is the largest Number");  
////comparing b with a and b with c  
////if both conditions are true, prints b  
//else if (b>=a && b>=c)  
//System.out.println(b+" is the largest Number");  
//else  
////prints c if the above conditions are false  
//System.out.println(c+" is the largest number");  
//}  
//}  