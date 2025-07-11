
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0 ;i<n ;i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<n-1 ;i++){
            int minIndex=i;
            for(int j =i+1 ;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
                if(minIndex!=i){
                    int temp=arr[i];
                    arr[i]=arr[minIndex];
                    arr[minIndex]=temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        } 
    }
}
