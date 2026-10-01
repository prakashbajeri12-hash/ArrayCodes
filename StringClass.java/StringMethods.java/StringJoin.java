import java.io.*;

public class StringJoin
{
	public static void main(String args[])
	{
		String s[] = {"Techno","Comp","Academy","Pune"};

		String result = String.join("-",s);

		System.out.println(result);
	}
}
