// what if we declare caller string as null  

import java.io.*;

public class StringInterviewQue
{
	public static void main(String args[])
	{
		String a = null;
		
		System.out.println(a.equalsIgnoreCase("TCA"));// NullPointerException
		System.out.println("TCA".equalsIgnoreCase(a));
	}
}