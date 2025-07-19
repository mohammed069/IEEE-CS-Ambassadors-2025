
import java.util.Arrays;
import java.util.Scanner;

public class L {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        scanner.nextLine();

        StringBuilder S = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < Q; i++) {
            String query = scanner.nextLine();
            String[] parts = query.split(" ");

            switch (parts[0]) {
                case "pop_back":
                    S.deleteCharAt(S.length() - 1);
                    break;

                case "front":
                    System.out.println(S.charAt(0));
                    break;

                case "back":
                    System.out.println(S.charAt(S.length() - 1));
                    break;

                case "sort":
                    int l = Integer.parseInt(parts[1]) - 1;
                    int r = Integer.parseInt(parts[2]) - 1;
                    char[] subArray = S.substring(l, r + 1).toCharArray();
                    Arrays.sort(subArray);
                    S.replace(l, r + 1, new String(subArray));
                    break;

                case "reverse":
                    int l2 = Integer.parseInt(parts[1]) - 1;
                    int r2 = Integer.parseInt(parts[2]) - 1;
                    StringBuilder sub = new StringBuilder(S.substring(l2, r2 + 1));
                    sub.reverse();
                    S.replace(l2, r2 + 1, new String(sub));
                    break;

                case "print":
                    System.out.println(S.charAt(Integer.parseInt(parts[1]) - 1));
                    break;

                case "substr":
                    int l3 = Integer.parseInt(parts[1]) - 1;
                    int r3 = Integer.parseInt(parts[2]) - 1;
                    System.out.println(S.substring(l3, r3 + 1));
                    break;

                case "push_back":
                    S.append(parts[1]);
                    break;

                default:
                    System.out.println("Invalid input ");
                    break;

            }

        }

    }

}
