import java.util.InputMismatchException;
import java.util.Scanner;

public class IntToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean success = false;
		while (!success) {
			try {
				System.out.println("Enter an integer: ");
				System.out.println(Integer.toHexString(input.nextInt()));
				input.close();
				success = true;
			} catch (InputMismatchException e) {
				System.out.println("Only integers accepted.");
				input.next();
			}
		}
	}

	
}
