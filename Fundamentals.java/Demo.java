import java.io.*;
import java.util.Scanner;

public class Demo
{
	public static void main(String args[])

	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius:");
		double radius = sc.nextDouble();

		double area = 3.14  * radius * radius;

		System.out.println("Area of Circle with  " + radius + " is " + area);




	}
}