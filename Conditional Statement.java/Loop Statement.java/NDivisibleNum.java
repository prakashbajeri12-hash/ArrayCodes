import java.io.*;
import java.util.Scanner;

public class NDivisibleNum
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

        System.out.println("Divisible Numbers : ");


        for(int i=1; i<=n ; i++ )

		if(i % 3 == 0 && i % 5 == 0)
		{
			System.out.println( i);
	    }
		

	}

		
}