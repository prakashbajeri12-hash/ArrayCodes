import java.io.*;

public class StringSplit
{
	public static void main(String args[])
	{
		String s = "7350407725,Prakash,10000,3000";

		String[] tokens = s.split(",");

		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
		System.out.println(tokens[2]);
		System.out.println(tokens[3]);



	}
}
/* Output
 7350407725
 Prakash
 10000
 3000 

*/