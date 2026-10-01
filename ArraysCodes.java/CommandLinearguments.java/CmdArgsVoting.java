import java.io.*;

public class CmdArgsVoting
{
	public static void main(String args[])
	{
		if(args.length == 0)
		{
			System.out.println("No Arguments sent from Command Line");
			System.exit(0);
		}

		int count = 0;
		
		for(int i=0 ; i<args.length ; i++)
		{
			int age = Integer.parseInt(args[i]);

			if(age >= 18)
			{
				 count++;
			}
		}
		System.out.println("Eligible Voting : " + count);
	}

}
