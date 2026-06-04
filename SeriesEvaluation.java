// Series Evaluation
import java.util.Scanner;
public class SeriesEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the series: ");
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("The sum of the series is: " + sum);
        sc.close();
    }
    
}
