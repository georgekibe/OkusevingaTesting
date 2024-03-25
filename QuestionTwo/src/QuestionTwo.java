import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		// To create a scanner object for user input
		Scanner scannerObject = new Scanner(System.in);

		// To prompt the user for input
		System.out.println("Please enter your first and last names:");

		// To read the entered input for names
		String firstName = scannerObject.next();
		String lastName = scannerObject.next();

		// To print the variables in upper-case characters and each in a separate line using printf
		System.out.printf("First Name: %s%n", firstName.toUpperCase());
		System.out.printf("Last Name: %s%n", lastName.toUpperCase());

		// Close the scanner to prevent resource leaks
		scannerObject.close();

	}

}
