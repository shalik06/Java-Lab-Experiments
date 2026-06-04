    // To design Java programs for swapping values using different approaches,
    // including with and without the use of a temporary variable.
import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Swapping using a temporary variable
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("\nBefore swapping (using temporary variable):");
        System.out.println("num1: " + num1 + ", num2: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping (using temporary variable):");
        System.out.println("num1: " + num1 + ", num2: " + num2);

        // Swapping without using a temporary variable
        System.out.print("\nEnter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.println("\nBefore swapping (without using temporary variable):");
        System.out.println("num1: " + num1 + ", num2: " + num2);

        num1 = num1 + num2; // Step 1
        num2 = num1 - num2; // Step 2
        num1 = num1 - num2; // Step 3

        System.out.println("After swapping (without using temporary variable):");
        System.out.println("num1: " + num1 + ", num2: " + num2);

        sc.close();
    }
}