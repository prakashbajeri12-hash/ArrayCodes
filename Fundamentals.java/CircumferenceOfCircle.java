import java.io.*;
//import java.util.Scanner;

public class CircumferenceOfCircle
{

	public static void main(String args[]) throws IOException
	{
       final double PI = 3.14;

       ///Scanner sc = new Scanner(System.in);

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.print("Enter  the Radius : ");

      // double radius = sc.nextDouble();

       double radius = Double.parseDouble(br.readLine());

       double area = PI * radius * radius;

       double circumference = 2 * PI * radius;

       System.out.println("Area of Circle : " + area);

       System.out.println("Circumference of Circle : " + circumference);


	}
}