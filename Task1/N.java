import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // قراءة الأرقام A و B
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.nextLine(); // لتفريغ البافر
        
        // قراءة السلسلة S
        String S = scanner.nextLine();
        
        boolean isValid = true;
        
        // الشرط الأول: طول السلسلة يجب يكون A + B + 1
        if (S.length() != A + B + 1) {
            isValid = false;
        } else {
            // الشرط الثاني: في الموضع A+1 يجب يكون '-'
            if (S.charAt(A) != '-') {
                isValid = false;
            } else {
                // الشرط الثالث: كل الحروف التانية لازم تكون أرقام
                for (int i = 0; i < S.length(); i++) {
                    if (i != A) { // نتجاهل الموضع اللي فيه '-'
                        char c = S.charAt(i);
                        if (!Character.isDigit(c)) {
                            isValid = false;
                            break;
                        }
                    }
                }
            }
        }
        
        // طباعة النتيجة
        System.out.println(isValid ? "Yes" : "No");
    }
}