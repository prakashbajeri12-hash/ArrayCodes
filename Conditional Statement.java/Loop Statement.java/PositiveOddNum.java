import java.io.*;
import java.util.Scanner;

public class PositiveOddNum
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

        System.out.println("Odd Number : ");

        for(int i=1 ; i<=n ; i++ )

		if(i % 2 == 1)
		{
			System.out.println(i);
	    }
		

	}

		
}