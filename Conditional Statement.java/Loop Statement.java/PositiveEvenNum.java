import java.io.*;
import java.util.Scanner;

public class PositiveEvenNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : " );

		int n = sc.nextInt();

		if(n < 0)
		{
			System.out.println("Invalid Input for Given number : " + n );
			System.exit(0);
	
        }

        System.out.println("Even Number : ");

        for(int i=0 ; i<=n ; i++ )

		if(i % 2 == 0)
		{
			System.out.println(i);
	    }
		

	}

		
}