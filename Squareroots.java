import java.util.Scanner;
import java.lang.Math;
public class Squareroots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is: " + squareRoot);
        sc.close();
    }
}
