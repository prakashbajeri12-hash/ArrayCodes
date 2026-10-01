import java.io.*;
import java.util.Scanner;

class PosNeg
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");

		int num = sc.nextInt();

		if (num == 0)
		{
			System.out.println("Number is Zero ... ");
		} 
		else if(num >= 1)
		{
			System.out.println("Positive Number... ");
		}

		else
		{
			System.out.println("Negative Number... ");
		}
	}
}