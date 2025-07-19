
import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        for (int i = 0; i < repeat; i++) {
            String S = scanner.next();
            String T = scanner.next();

            StringBuilder result = new StringBuilder();
            int length = Math.max(S.length(), T.length());
            
            for (int j = 0; j < length; j++) {
                if (j < S.length()) {
                    result.append(S.charAt(j));
                }
                if (j < T.length()) {
                    result.append(T.charAt(j));
                }
            }
            System.out.println(result.toString());
        }

    }
}
