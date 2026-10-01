import java.io.*;
import java.util.*;

public class SumOfArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the Array : ");
	    int n = sc.nextInt();

	    int a[] = new int [n];

	    for(int i=0 ; i<a.length ; i++)
	    {
	    	System.out.print("Enter the data :");
	    	a[i] = sc.nextInt();
	    }

	    System.out.println("Array ==> " + Arrays.toString(a));

	    int ans = 0;

	    for(int i=0 ; i<a.length;i++)
	    {
	    	ans = ans + a[i];
	    }

	    System.out.println("Sum Of an Array Elements : " + ans);

	}
}