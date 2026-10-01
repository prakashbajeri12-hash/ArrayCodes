import java.io.*;
import java.util.Scanner;

class WholeNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");

		int num = sc.nextInt();

		if (num >= 0)
		{
			System.out.println("Whole Number... ");
		} 
		else
		{
			System.out.println("Not Whole Number... ");
		}
	}
}