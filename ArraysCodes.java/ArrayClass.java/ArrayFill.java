import java.io.*;
import java.util.*;

public class ArrayFill
{
	public static void main(String args[])
	{
		int a[] = new int[5];

		Arrays.fill(a,77);

		System.out.println("Filled Array : " + Arrays.toString(a));

	}

}