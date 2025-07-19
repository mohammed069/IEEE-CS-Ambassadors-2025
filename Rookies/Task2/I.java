import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isPalindrome = true;
        int n = input.length();
        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n-1 -i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
