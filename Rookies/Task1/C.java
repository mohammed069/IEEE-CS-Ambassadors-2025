
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i =0; i<n ; i++){
            int x = scanner.nextInt();
            if (x>0){
                arr[i] = 1;
            } else if (x<0){
                arr[i] = 2;
            }else {
                arr[i] = 0;
            }
        }
        for(int i =0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
