
import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String x = "hello";
        int index = 0;

        for (int i = 0 ; i<input.length();i++){
            if (input.charAt(i) == x.charAt(index) ){
                index++;
                if (index == x.length()) {
                    System.out.println("YES");
                    return;
                }
            } 
        }
        System.out.println("NO");
    }
    
}
