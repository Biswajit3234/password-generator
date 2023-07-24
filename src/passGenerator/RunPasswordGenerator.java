package passGenerator;



public class TestPasswordGenerator {

	public static void main(String[] args)
	{
		int i = 0,
			range = 15;

		do
		{
			PasswordGenerator.main(null);
			i++;

		}while(i <= range);

	}

}
