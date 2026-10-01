import java.io.*;

public class CmdArgsSum
{
	public static void main(String args[])
	{
		if(args.length == 0)
		{
			System.out.println("No Arguments sent from Command Line");
			System.exit(0);
		}

		int sum = 0;

		for(int i=0 ; i<args.length ; i++)
		{
			int num = Integer.parseInt(args[i]);

			sum = sum + num;

		}

		System.out.println("Addition is : " + sum);
	}
}