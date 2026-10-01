import java.io.*;
import java.util.Scanner;

class Division
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first Number : ");

		double a = sc.nextDouble();

		System.out.print("Enter the second  Number : ");

		double b = sc.nextDouble();

	
		if (b==0)
		{
			System.out.println("Cannot Perform Division by Zero ");
		} 
		else
		{

			double ans = a/b;

			System.out.println("Division = " + ans );
		}
	}
}