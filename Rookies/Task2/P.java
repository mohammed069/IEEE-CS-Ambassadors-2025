
import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        boolean isWord = false;
        for (int i=0 ;i<input.length();i++){
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                if (!isWord) {
                    isWord = true;
                    count++;
                }
            } else {
                isWord = false;
            }
        }
        System.out.println(count);
    }
}
