import java.io.*;

public class CmdArgsMax
{
	public static void main(String args[])
	{
		if(args.length == 0)
		{
			System.out.println("No Arguments sent from Command Line");
			System.exit(0);
		}

		int max = Integer.parseInt(args[0]);

		for(int i=0 ; i<args.length ; i++)
		{
			int num = Integer.parseInt(args[i]);

			if(num > max)
			{
				 max = num;
			}
		}
		System.out.println("Maximum Number : " + max);
	}

}

