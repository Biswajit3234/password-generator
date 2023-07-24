package passGenerator;

import java.util.Scanner;

public class Input
{
	private static Scanner input = new Scanner(System.in);
	
	public static int getUserInput(String statement) 
	{
		System.out.println(statement);
		
		return input.nextInt();
	}
	
	
}
