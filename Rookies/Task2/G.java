
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLowerCase(input.charAt(i))) {
                chars[i] = Character.toUpperCase(input.charAt(i));
            } else if (Character.isUpperCase(input.charAt(i))) {
                chars[i] = Character.toLowerCase(input.charAt(i));
            }
            else {
                chars[i] = input.charAt(i);
            }
        }
        System.out.println(new String(chars));
    }
}
