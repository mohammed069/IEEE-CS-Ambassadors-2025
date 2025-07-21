
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        solveEquation(X, N);
    }

    public static void solveEquation(int X, int N) {
        double result = Math.pow(X, 0)-1;
        for (int i = 2; i <= N; i++) {
            if (i % 2 == 0) {
                result += Math.pow(X, i);
            } 
        }
        System.out.printf("%.0f\n", result);
    }
    
}
