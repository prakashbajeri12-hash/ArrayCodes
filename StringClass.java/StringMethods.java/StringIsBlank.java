import java.io.*;

public class StringIsBlank
{
	public static void main(String args[])
	{
		String s = "   ";

		System.out.println(s.isEmpty());// false
		System.out.println(s.isBlank());// true
	}
}
