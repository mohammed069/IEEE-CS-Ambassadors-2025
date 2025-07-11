import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;

        int frequency=0;


        for(int i=0 ;i<n ;i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0 ;i<n ;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        for(int i=0 ; i<n ;i++){
            if(arr[i]==min){
                frequency++;
            }
        }

        if(frequency%2 != 0){
            System.out.println("Lucky");
        }else{
            System.out.println("Unlucky");
        }


    }
}
