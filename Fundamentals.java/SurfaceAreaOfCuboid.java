import java.io.*;
//import java.util.Scanner;

public class SurfaceAreaOfCuboid
{
	public static void main(String args[]) throws IOException
	{

		//Scanner sc = new Scanner(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the length of Cuboid : ");
		//double l = sc.nextDouble();

		double l = Double.parseDouble(br.readLine()); 

		System.out.print("Enter the breadth of Cuboid : ");
		//double b = sc.nextDouble();

		double b = Double.parseDouble(br.readLine());


		System.out.print("Enter the height of Cuboid : ");
		//double h = sc.nextDouble();

		double h = Double.parseDouble(br.readLine());

		double surface_area = 2 * (l*b + l*h + b*h);

		System.out.println("Surface Area of Cuboid is : " + surface_area);
	}
}
