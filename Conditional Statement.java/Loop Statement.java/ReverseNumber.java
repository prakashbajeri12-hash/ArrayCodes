import java.io.*;
import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String args[] )
	{   
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");

		int number = sc.nextInt();
		

		int reversed = 0;

		while(number != 0)
		{
			int digit = number % 10 ; // 1. get last digit 

			reversed = reversed * 10 + digit; // 2. append it to the reverse number

			number /= 10; // 3. remove the last digit from original 
		}

		System.out.println("Reversed Number : " + reversed);
	}
}