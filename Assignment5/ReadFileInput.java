import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileInput {

	public static void main(String[] args) {
		Scanner input;
		try {
			input = new Scanner(new File("quote.txt"));
			while(input.hasNextLine())
				System.out.println(input.nextLine() + "\n");
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
			e.printStackTrace();
		}
		
	}

}
