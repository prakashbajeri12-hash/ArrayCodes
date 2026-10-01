import java.io.*;
import java.util.Scanner;

public class LiesBetweenThirdNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the First Number : ");

		int a = sc.nextInt();

		System.out.print("Enter the Second Number : ");

		int b = sc.nextInt();

		System.out.print("Enter the Third Number : ");

		int c = sc.nextInt();

		if(c > a && c < b)
		{
			System.out.println(c + " Lies Between " + a + " and " + b );

		}
		else if(c < a && c > b)
		{
			System.out.println(c + " Lies Between " + a + " and " + b);

		}

		else
		{
			System.out.println(c + " Not Lies Between " + a + " and " + b);
		}
	
    }
}