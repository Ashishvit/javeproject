package javacode2;

public class fabonacii_series {

		  public static void main(String[] args) {

		    int n =10, firstterm = 0, secondterm = 1;
		    System.out.println("Fibonacci Series of ten terms");

		    for (int i = 1; i <= n; ++i)
		    {
		      System.out.println(firstterm);

		
		      int nextterm = firstterm + secondterm;
		      firstterm = secondterm;
		      secondterm = nextterm;
		    }
		  }
		}