
import java.io.*;
import java.util.*;

public class InterviewQueProve
{
	public static void main(String args[])
	{
		int a[] = {11,22,33};

		int b[] = new int[3];

		b=a;

		System.out.println(Arrays.toString(b));
		System.out.println("Arrays a's Reference :" + a);
		System.out.println("Arrays b's Reference :" + b);
	}
		
}


/* Hence Proved
  Output --> [11, 22, 33]
  Arrays a's Reference :[I@251a69d7
  Arrays b's Reference :[I@251a69d7
*/