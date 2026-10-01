import java.io.*;
import java.util.Scanner;

public class MaxNum
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

		if(a==b && b==c)
		{
			System.out.println("All three Numbers are Equal ..." );

		}
		else if(a>=b && a>=c)
		{
			System.out.println("Maximum Number  " + a);

		}
		else if(b>=c)
		{
			System.out.println("Maximum Number  " + b);
		}
		else
		{
			System.out.println("Maximum Number " + c);
		}
	
    }
}