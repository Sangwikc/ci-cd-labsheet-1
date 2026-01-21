import java.util.Scanner; // Import the Scanner class to read user input

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter an integer: ");

        // Read the integer from the user and store it in a variable
        int number = scanner.nextInt();

        // Check if the number is even or odd using the modulus operator
        if (number % 2 == 0) {
            // If the remainder when divided by 2 is 0, the number is even
            System.out.println("The number " + number + " is Even.");
        } else {
            // Otherwise, the number is odd (remainder is 1)
            System.out.println("The number " + number + " is Odd.");
        }

        // Close the scanner
        scanner.close();
    }
}
