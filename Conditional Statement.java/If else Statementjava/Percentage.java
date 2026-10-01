import java.io.*;
import java.util.Scanner;

class Percentage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Percentage : ");

		double per = sc.nextDouble();

		if (per >= 40)
		{
			System.out.println(" Pass.. ");
		} 
		else
		{
			System.out.println(" Failed..");
		}
	}
}