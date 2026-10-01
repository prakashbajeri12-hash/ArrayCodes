// This method convert String Into Array..

import java.io.*;

public class StringToCharArray
{
	public static void main(String args[])
	{
		String s = "IND";

		char a[]= s.toCharArray();

		for(int i=0 ; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
