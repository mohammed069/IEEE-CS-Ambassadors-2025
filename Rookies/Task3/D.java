
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            isPrime(a);
        }
        
    }

    public static void isPrime(int n) {
        if (n <= 1) {
            System.out.println("NO");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
}
