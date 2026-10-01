import java.io.*;
import java.util.*;

public class MaxArray
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

		int max=a[0];

		for(int i=0 ; i<a.length ; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("Maximum Number : " + max);

	}
}