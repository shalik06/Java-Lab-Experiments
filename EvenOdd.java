// To apply decision-making constructs in Java to solve problems such as
// checking even or odd numbers and implemenƟng condiƟonal logic.
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        sc.close();
    }
}