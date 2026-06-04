// Factorial Calculation
import java.util.Scanner;
import java.math.BigInteger;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The factorial of " + number + " is: " + factorial);
        sc.close();
    }
    
}
