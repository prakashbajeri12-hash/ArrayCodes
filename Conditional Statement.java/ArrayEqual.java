import java.io.*;
import java.util.*;

public class ArrayEqual
{
	public static void main(String args[])
	{
		int a[] = {22,11,33,44,55,66};
		int b[] = {22,11,33,44,55,66};

		
		if(Arrays.equals(a,b))
			System.out.println("Both Arrays are Equal");
		else
			System.out.println("Both Arrays are Not Equal");
	}
}