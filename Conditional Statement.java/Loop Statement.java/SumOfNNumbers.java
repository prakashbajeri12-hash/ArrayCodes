import java.io.*;
import java.util.Scanner;

public class SumOfNNumbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : " );

		int n = sc.nextInt();

		if(n < 0)
		{
			System.out.println("Invalid Input for Factorial number : " + n );
			System.exit(0);
	
        }


		int sum = 0;

		for(int i=1 ; i<=n ; i++ )
		{
			sum = sum + i;
		}

		System.out.println("Sum Of n Numbers = " + sum);
	}

}