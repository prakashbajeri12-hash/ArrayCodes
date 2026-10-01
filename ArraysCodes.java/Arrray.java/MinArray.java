import java.io.*;
import java.util.*;

public class MinArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array : ");
		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i=0 ; i<a.length ; i++)
		{
			System.out.print("Enter the data :");
			a[i] = sc.nextInt();
		}

		System.out.println("Array --> " + Arrays.toString(a));

		int min=a[0];

		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println("Minimum Number : " + min);

	}
}