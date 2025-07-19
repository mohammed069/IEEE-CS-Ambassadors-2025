
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n-1-i];
            System.out.print(reversed[i] + " ");
        }

    }
}
