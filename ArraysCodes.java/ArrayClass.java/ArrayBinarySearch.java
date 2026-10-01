import java.io.*;
import java.util.*;

public class ArrayBinarySearch
{
	public static void main(String args[])
	{
		int a[] = {22,11,33,44,55,66};

		System.out.println("Before Sort :" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sort  : " + Arrays.toString(a));

		int pos = Arrays.binarySearch(a,33);
		if(pos >= 0)
			System.out.println("33 is found at position " + pos);
		else
			System.out.println("33 is  Not found " );
	}
}