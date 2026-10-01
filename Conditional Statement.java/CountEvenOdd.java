import java.io.*;
import java.util.*;

public class CountEvenOdd
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

	    System.out.println("Array --> " + Arrays.toString(a));

	    int even_cnt = 0;

	    int odd_cnt = 0;


	    for(int i=0 ; i<a.length;i++)
	    {
	    	if(a[i] % 2 == 0)
	    	{
	    		
	    		even_cnt++;
	    		
	    	}

	    	else 
	    	{
	    		odd_cnt++;
	    	}
	    }
         
         System.out.println("Total Even Number : " + even_cnt);

         System.out.println("Total Odd Number : " + odd_cnt);


	   
	}
}