package question6;
import java.util.Scanner;
public class Calculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the use of Calculator");
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Select operation:");
	        System.out.println("1. Add");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Product");
	        System.out.println("4. Division");

	        System.out.print("Enter your choice (1-4): ");
	        int choice = scanner.nextInt();

	        double result = 0;

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                System.out.println("Sum: " + num1 + " + " + num2 + " = " + result);
	                break;
	            case 2:
	                result = num1 - num2;
	                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);
	                break;
	            case 3:
	                result = num1 * num2;
	                System.out.println("Product: " + num1 + " * " + num2 + " = " + result);
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
	                } else {
	                    System.out.println("Error: Cannot divide by zero.");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	        }
	    }
}
