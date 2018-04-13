/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */


import javax.swing.*;
import java.util.*;

public class pairshare
{


/*
	// good to use constants to difine arrays
	final static int  MAX = 5000000;
	//static int whatever = 0;
*/
	  public static void main (String[] args)
   {
	   //System.out.println(print(5));
	   print(5);
	   System.out.println();
	   rev_print(5);
	   System.out.println();
	   System.out.println(print_str("hello"));
	   System.out.println();
	   //System.out.println(prime(5));
/*

	   System.out.println(sum(5) + "-----");

	   System.out.println( "is" + pow(3,3) );
/**/
	   //make int array of 100 and pop with 100 random int' 1-500
/*
		int[] num = new int[MAX];
		Random gen = new Random();



		for ( int i = 0; i < MAX ; i++)
			num[i] = gen.nextInt(1000000)+1;

		for (int j = 4980000 ; j<MAX; j++)
			System.out.print(num[j]+"\t");


		//Make an array or strings with 10 names
		String[] names = {"Mike", "Jon", "Amber", "Jane",
						  "James", "Homer", "Alex", "Nic",
						  "Emy", "Nolan", "Christine", "Dave"};





/*
	//System.out.println( pow (4,3) + "p");

	System.out.println(reverse("abcd");
	reverse("abcd");


		//ei();
/**/
	//infinite(5);
/**/
   }// end of main






/*
public static int pow (int a, int b)
{

	return 0;
}


 public static double  btp(int a, int b)
{
	return 0;
}


	public static int foo(int num)
	{

		return 0;

	}










		public static void ei ()
		{

		}


	public static void multi ( int a, int b)
	{
		if(b == 0)
			return 0;
		else
		{
			return a + multi(a, b -1);
		}
	}



	public static int sum(int num)
	{
		if(num == 0)
			return 0;
		else
			return num + sum(num - 1);
	}
*/
	//public int end;
	public static String print(int num)
	{
		if (num == 0)
		{
			System.out.print("0");
			return "";
		}
		else
		{
			System.out.print( num );
			return print(num - 1);
		}
	}

	public static String rev_print(int num)
	{
		if (num == 0)
		{
			//System.out.println("0");
			System.out.print("0");
			return "";
		}
		else
		{
			System.out.print(num + rev_print(num - 1));
			return "";
		}
	}

	public static String print_str(String string)
	{
		int end = (string.length()) - 1;
		return print_str(string, end);
		/*
		if(end == 0)
		{
			return string.indexOf(0);
		}
		else
		{
			return string.charAt(end) + print_str(string.substring(end - 1));
		}*/
	}

	public static String print_str(String string, int end)
	{

		if(end == 0)
		{
			return string.charAt(0) + "";
		}
		else
		{
			return string.charAt(end) + print_str(string, end - 1);
		}
	}
	public static int count = 0;
	public static int divide = 0;
	public static boolean prime(int n, int a) //n = number we're checking, a = the number that we're dividing by
	{
		/*
		if (divide == 1 && count < 2)
		{
			return true;
		}
		else
		{
			if ((n %(n - divide))== 0)
			{
				count++;
				return false;
			}
			else
			{
				divide++;
				return prime(n - divide);
			}
		}*/
		//if (n ==
		if (a == 1)
		{
			return true; //if one true, it returns all true
		}
		else if (n%a == 0)
			return false;
		else
			return prime(n, a - 1);
	}

	public static int fib(int n)
	{
		if (n < 1)
			return 0;
		else if (n == 1)
			return 1;
		else
		{
			return fib(n - 1) + fib(n - 2);
		}
	}
}//end of class