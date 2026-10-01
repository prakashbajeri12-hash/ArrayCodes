import java.io.*;

public class StringEqualsIgnoreCase
{
	public static void main(String args[])
	{
		String s1 = "TCA";
		String s2 = "tca";
		String s3 = "TCA";

		System.out.println(s1.equalsIgnoreCase(s2));// true
		System.out.println(s1.equalsIgnoreCase(s3));// true
	}
}