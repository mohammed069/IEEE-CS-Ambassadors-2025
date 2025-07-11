
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeat = scanner.nextInt();
        int smallest = Integer.MAX_VALUE;
        for(int k=0;k<repeat;k++){
            int n = scanner.nextInt();

            int[] arr = new int[n];

            for(int i=0 ;i<n ;i++){
                 arr[i] = scanner.nextInt();
            }

            for(int i=0 ;i<n ;i++){
                for(int j=i+1 ; j<n ;j++){
                    if((arr[i]+arr[j]+j-i)<smallest){
                        smallest=arr[i]+arr[j]+j-i;
                    }
                }
            }
        }
        System.out.println(smallest+" ");
    }
}