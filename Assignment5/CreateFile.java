import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class CreateFile {

	public static void main(String[] args) {
		try {
			FileWriter output = new FileWriter(new File("command_line_input.txt"));
			Scanner input = new Scanner(System.in);
			String line;
			while (!(line=input.nextLine()).equals("@q")) 
			{
			output.write(line + "\n");
			}
			System.out.println("File Written.");
			input.close();
			output.close();
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		

			
		
		
		
	}

}
