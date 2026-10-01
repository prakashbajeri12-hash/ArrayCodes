import java.io.*;
// /import java.util.Scanner;

public class FinalVelocity
{

	public static void main(String args[]) throws IOException
	{

		//Scanner sc = new Scanner(System.in);

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the Initial Velocity(u) : ");
		//double u = sc.nextDouble();
		double u = Double.parseDouble(br.readLine());

		System.out.print("Enter the Accelaration(a) : ");
		//double a = sc.nextDouble();
		double a = Double.parseDouble(br.readLine());

		System.out.print("Enter the Time(t) : ");
		//double t = sc.nextDouble();
		double t = Double.parseDouble(br.readLine());

		double v = u + a * t;

		System.out.println("Final Velocity is : " + v);
	}
}