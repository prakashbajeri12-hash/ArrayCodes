import java.io.*;
import java.util.Scanner;

public class Divisible
{

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");

        int num = sc.nextInt();

		
		if(num % 5 == 0 && num % 7 ==0)
		{
			System.out.println(num + " is divisible by 5 and 7..");

		}
		else if(num % 5 == 0)
		{
			System.out.println(num + " is divisible by 5..");

		}
		else if(num % 7 == 0)
		{
			System.out.println(num + " is divisible by 7..");

		}
		else
		{
			System.out.println(num + " Number is Not Divisible by 5 and 7...");
		}
	}
}