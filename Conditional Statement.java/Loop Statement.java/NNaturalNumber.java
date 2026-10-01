import java.io.*;
import java.util.Scanner;

public class NNaturalNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : " );

		int n = sc.nextInt();

		if(n < 1)
		{
			System.out.println("Invalid Input for n number : " + n );
			System.exit(0);
		}

		System.out.println("Natural Number : ");

		for(int i=1 ; i<=n ; i++ )
		{
			System.out.println(i);
		}
	}

}