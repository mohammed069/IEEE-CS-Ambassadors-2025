
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        swapNumbers(a, b);
    }

    public static void swapNumbers(int a, int b) {
        System.out.println( b + " " + a);
    }
    
}
