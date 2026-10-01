import java.io.*;
import java.util.Scanner;

public class Calculator

{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the First Number : ");

		double a = sc.nextDouble();

		System.out.print("Enter the Second Number : ");

		double b = sc.nextDouble();

		System.out.println("\n----------------------");
		System.out.println("        MENU         ");
		System.out.println("----------------------");

		System.out.println("1.  Addition          ");
		System.out.println("2.  Subtraction       ");
		System.out.println("3.  Multiplication    ");
		System.out.println("4.  Division          "); 

		System.out.print("Enter the Choice : ");

		int choice = sc.nextInt();

		switch(choice)
		{
         
         case 1:
          double add = a + b;
          System.out.println("Addition = " + add);
          break;

         case 2:
          double sub = a - b;
          System.out.println("Subtraction = " + sub);
          break;

         case 3:
          double mul = a * b;
          System.out.println("Multiplication = " + mul);
          break;

         case 4:
         	if(b==0)
         	{
         		System.out.println(" Cannot Perform Division By Zero.... ");

         	}
         	else
         	{
         		double div = a / b;

         		System.out.println("Division = " + div);
         	}
         	break;


         default :

         	System.out.println("Invalid Choice !!! ");


		}


	}
}
 
