import java.util.Scanner;

public class QuestionFour {

	public static void main(String[] args) {


		// Creating a Scanner object for read input 
        Scanner scannerObject = new Scanner(System.in);
        
        // Asking the user to enter name
        System.out.print("Enter your name: ");
        String name = scannerObject.nextLine();
        
        // Printing a welcome message
        System.out.println("Welcome, " + name + "!");
        
        // Asking the user to enter a number
        System.out.print("Enter a number: ");
        double numberInput = scannerObject.nextDouble();
        
        // Checking the type of the number and then printing the result
        if (numberInput > 0) {
            System.out.println("Positive number.");
        } else if (numberInput < 0) {
            System.out.println("Negative number.");
        } else {
            System.out.println("Number is zero.");
        }
        
        // Closing the scanner to prevent resource leak
        scannerObject.close();

	}

}
