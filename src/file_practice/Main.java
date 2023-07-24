package file_practice;


public class Main {

	public static void main(String[] args)
	{
		String question = "What is the name of the file?";
		String answer = null;

		answer = Input.getUserInput_String(question);


		new CreateFile(answer);

	}

}
