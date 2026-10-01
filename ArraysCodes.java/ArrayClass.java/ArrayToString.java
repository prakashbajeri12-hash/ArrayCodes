import java.io.*;
import java.util.*;

public class ArrayToString
{
	public static void main(String args[])
	{
		int a[] = {22,11,33,44,55,66};

		for(int i=0 ; i<a.length ; i++)
		{
          System.out.print(a[i] + " ");
		}

		System.out.println();
		System.out.println("Array is : " + Arrays.toString(a));
	}
}