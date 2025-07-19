import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum=0;

        int[] arr = new int[n];

        for(int i=0 ;i<n ;i++){
            arr[i] = scanner.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
