import java.io.*;

public class StringEquals
{
	public static void main(String args[])
	{
		String s1 = "TCA";
		String s2 = "tca";
		String s3 = "TCA";

		System.out.println(s1.equals(s2));// false
		System.out.println(s1.equals(s3));// true
	}
}