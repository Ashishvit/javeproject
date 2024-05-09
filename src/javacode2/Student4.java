package javacode2;
import java.util.Scanner;



	class Student4
	{
	    int id;
	    String name;
	    
	    Student4(int i,String n)
	    {
	    id = i;
	    name = n;
	    }
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    	}
	 
	    public static void main(String args[])
	    {
	  
	     Scanner sc = new Scanner(System.in);
	System.out.println("Enter a num ");
	     int x = sc.nextInt();
	     //Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string: ");
	     String str= sc.nextLine();

	    Student4 s2 = new Student4(x, str);
	   
	    s2.display();
	   }
	

		
	}



