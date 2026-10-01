import java.io.*;
//import java.util.Scanner;

 public class DimensionsOfCylinder
 { 
 	public static void main(String args[]) throws IOException
 	{
     
     final  double PI = 3.14;

     //Scanner sc = new Scanner(System.in);

     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));


     System.out.print("Enter the Radius : ");
     //double r = sc.nextDouble();

     double r = Double.parseDouble(br.readLine());

     System.out.print("Enter the Height : ");
     //double h = sc.nextDouble();

     double h = Double.parseDouble(br.readLine());

     double surface_area = 2*PI*r*2 + 2*PI*r*h;

     double  volume = PI*r*2*h;

     System.out.println("Surface Area of Cylinder : " + surface_area);

     System.out.println("Volume of Cylinder : " + volume);

 	}
 }