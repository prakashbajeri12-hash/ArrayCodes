import java.io.*;
import java.util.Scanner;

public class AreaOfShapes

{
	public static void main(String args[])
	{
     
     final double PI = 3.14;


		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Area of Circle : ");

		double radius = sc.nextDouble();

		System.out.print("Enter the Length of Rectangle : ");

		double length = sc.nextDouble();

		System.out.print("Enter the Breadth of Rectangle : ");

		double breadth = sc.nextDouble();

		System.out.print("Enter the Sides of Square : ");

		double side = sc.nextDouble();

		System.out.println("\n----------------------");
		System.out.println("        MENU         ");
		System.out.println("----------------------");

		System.out.println("1.  Area of Circle          ");
		System.out.println("2.  Area of Rectangle       ");
		System.out.println("3.  Area of Square          ");

		System.out.print("Enter the Choice : ");

		int choice = sc.nextInt();

		switch(choice)
		{
         
         case 1:
          double circle = PI * radius * radius;
          System.out.println("Area of Circle = " + circle);
          break;

         case 2:
          double rectangle = length * breadth;
          System.out.println("Area of Rectangle  = " + rectangle);
          break;

         case 3:
          double square = side * side;
          System.out.println("Area of Square = " + square);
          break;

        
         default :

         	System.out.println("Invalid Choice !!! ");


		}


	}
}
 
