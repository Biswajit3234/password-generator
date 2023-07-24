package file_practice;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Write_File {

	public static void Write(String content)
	{
		int i = 0;

		List<String> lines = new ArrayList();
		lines.add(content);



		Path file = Paths.get("sample_Test.txt");
		try {

			Files.write(file, lines, Charset.forName("UTF-8"),StandardOpenOption.APPEND);
		} catch (IOException e) {

			e.printStackTrace();
		}




	}

}
