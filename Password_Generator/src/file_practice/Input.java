package file_practice;

import java.util.Scanner;

public class Input
{
	private static Scanner input = new Scanner(System.in);

	public static int getUserInput(String statement)
	{
		System.out.println(statement);

		return input.nextInt();
	}

	public static String getUserInput_String(String statement)
	{
		System.out.println(statement);

		return input.nextLine();
	}


}
