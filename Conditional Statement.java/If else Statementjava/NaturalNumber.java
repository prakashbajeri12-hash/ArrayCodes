import java.io.*;
import java.util.Scanner;

class NaturalNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");

		int num = sc.nextInt();

		if (num >= 1)
		{
			System.out.println("Natural Number... ");
		} 
		else
		{
			System.out.println("Not Natural Number... ");
		}
	}
}