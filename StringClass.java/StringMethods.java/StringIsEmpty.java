import java.io.*;

public class StringIsEmpty
{
	public static void main(String args[])
	{
		String s1 = "";
		String s2 = " ";
		String s3 = "Prakash";
		
		System.out.println(s1.isEmpty());// true
		System.out.println(s2.isEmpty());// false
		System.out.println(s3.isEmpty());// false
	}
}