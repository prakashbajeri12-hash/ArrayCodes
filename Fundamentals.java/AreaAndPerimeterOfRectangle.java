import java.io.*;
//import java.util.Scanner;

public class AreaAndPerimeterOfRectangle
{
	public static void main(String args[]) throws IOException
	{
       //Scanner sc = new Scanner(System.in);

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

       System.out.print("Enter the length of Rectangle:");
       double length = Double.parseDouble(br.readLine());

       //double length = sc.nextDouble();

       System.out.print("Enter the width of Rectangle:");
       double width = Double.parseDouble(br.readLine());

       //double width = sc.nextDouble();

       double area = length * width;
       double perimeter = 2 * (length + width);

       System.out.println("Area of Rectangle is :" + area);
       System.out.println("Perimeter of Rectangle is :" + perimeter);

	}

}