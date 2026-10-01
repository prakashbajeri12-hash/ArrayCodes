import java.io.*;
import java.util.*;

public class ArrayCopyOf
{
	public static void main(String args[])
	{
		int a[] = {11,22,33};

		int b[] = Arrays.copyOf(a,a.length);

		System.out.println(Arrays.toString(b));
		System.out.println("Arrays a's Reference :" + a);
		System.out.println("Arrays b's Reference :" + b);
	}
		
}
/* Output 
[11, 22, 33]
Arrays a's Reference :[I@251a69d7
Arrays b's Reference :[I@6b95977
--> Reference is Different
*/