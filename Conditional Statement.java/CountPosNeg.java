import java.io.*;
import java.util.*;

public class CountPosNeg
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

	    int positive_cnt = 0;

	    int negative_cnt = 0;


	    for(int i=0 ; i<a.length;i++)
	    {
	    	if(a[i] >= 0)
	    	{
	    		
	    		positive_cnt++;
	    		
	    	}

	    	else 
	    	{
	    		negative_cnt++;
	    	}
	    }
         
         System.out.println("Total Positive Number : " + positive_cnt);

         System.out.println("Total Negative Number : " + negative_cnt);


	   
	}
}