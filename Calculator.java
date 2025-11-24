import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Display menu of operations
        System.out.println("Welcome to the Simple Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Substract");
        System.out.println("3. *");
        System.out.println("4. /");

        // Get the user's choice
        int choice = scanner.nextInt();

        // Get the two numbers from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        // Perform the chosen operation
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                // Check if the user is trying to divide by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }

        // Close the scanner object
        scanner.close();
    }
}
