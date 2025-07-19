import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
       
        String S = scanner.nextLine();
        
        boolean isValid = true;
        
        if (S.length() != A + B + 1) {
            isValid = false;
        } else {
            if (S.charAt(A) != '-') {
                isValid = false;
            } else {
                for (int i = 0; i < S.length(); i++) {
                    if (i != A) { 
                        char c = S.charAt(i);
                        if (!Character.isDigit(c)) {
                            isValid = false;
                            break;
                        }
                    }
                }
            }
        }
        
        System.out.println(isValid ? "Yes" : "No");
    }
}