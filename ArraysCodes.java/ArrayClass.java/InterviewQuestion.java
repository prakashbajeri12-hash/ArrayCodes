// Statement [b=a] is array 'a' copy into 'b' ??
// Ans --> No, because it's not array copy operation , it is reference copy operation 

import java.io.*;
import java.util.*;

public class InterviewQuestion
{
	public static void main(String args[])
	{
		int a[] = {11,22,33};

		int b[] = new int[3];

		b=a;

		System.out.println(Arrays.toString(b));
	}
}

// Output --> [11, 22, 33]