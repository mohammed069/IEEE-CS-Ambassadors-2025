
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int indexMin = -1;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x < min) {
                min = x;
                indexMin = i;
            }
        }
        System.out.println(min+ " " + indexMin);
    }
}
