import java.io.*;
import java.util.*;

public class ReverseArray
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

	    for( int data :a)
	    {
	    	System.out.println(data);
	    }
	   

	    for(int i=n-1 ; i>=0;i--)
	    {
	    	System.out.println("Reverse Array = " + a[i]);
	    }
         
        

	   
	}
}