import java.io.*;
import java.util.Scanner;

public class Test

{
	public static void main(String args[])
	{

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Fisrt Number :");
		int a = sc.nextInt();

		System.out.print("Enter the Second Number :");
		int b = sc.nextInt();

		int ans = a+b;

		System.out.println("Addition of " + a + " and " + b + " is " + ans);
	}
}
