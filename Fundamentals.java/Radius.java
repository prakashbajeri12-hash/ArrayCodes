import java.io.*;
public class Radius
{
public static void main(String args[]) throws IOException
{
  
	BufferedReader br = new BufferedReader ( new InputStreamReader(System.in) );
	System.out.print("Enter the Radius:");
	Float radius  = Float.parseFloat(br.readLine());

	float  area =(float) Math.PI * radius * radius;
	System.out.printf("Area of circle : %.2f",area);
}

}