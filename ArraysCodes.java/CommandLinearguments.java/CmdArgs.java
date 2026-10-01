import java.io.*;

public class CmdArgs
{
	public static void main(String args[])
	{
		if(args.length == 0)
		{
			System.out.println("No Arguments sent from Command Line");
			System.exit(0);
		}

		System.out.println("List of Command Line Arguments : ");

		for(int i=0 ; i<args.length ; i++)
		{
			System.out.println(args[i]);
		}
	}
}