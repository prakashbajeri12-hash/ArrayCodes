import java.io.*;
import java.util.Scanner;

public class MaximumNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the First Number : ");

		int a = sc.nextInt();

		System.out.print("Enter the Second Number : ");

		int b = sc.nextInt();

		if(a==b)
		{
			System.out.println(" Numbers are Equal ..." );

		}
		else if(a>b)
		{
			System.out.println("Maximum Number  " + a);

		}
		else
		{
			System.out.println("Maximum Number  " + b);
		}
	
    }
}