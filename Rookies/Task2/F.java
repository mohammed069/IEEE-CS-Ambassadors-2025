
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0 ;i<repeat; i++){
            String input = scanner.nextLine();

            if(input.length() > 10) {
                System.out.println(input.charAt(0) + "" + (input.length() - 2) + "" + input.charAt(input.length() - 1));
            }else {
                System.out.println(input);
            }
        }
    }
    
}
