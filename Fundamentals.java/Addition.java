import java.io.*;
public class Addition
{
	public static void main(String args[]) throws IOException
{
    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    System.out.print("Enter the First Number:");
    double a= Double.parseDouble(br.readLine());

    System.out.print("Enter the Second Number:");
    double b= Double.parseDouble(br.readLine());

    double ans= a+b;

    System.out.println("Addition of " + a + " and " + b + " is " + ans);
}

}