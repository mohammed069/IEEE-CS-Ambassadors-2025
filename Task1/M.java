import java.util.Scanner;

public class M{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex=0;
        int maxIndex=0;

        for(int i=0 ;i<n ;i++){
            arr[i] = scanner.nextInt();
            if(arr[i]>max){
                maxIndex=i;
            }
            if(arr[i]<min){
                minIndex=i;
            }
 
        }
        int temp = arr[minIndex];
        arr[minIndex]=arr[maxIndex];
        arr[maxIndex] = temp;
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
    }
}