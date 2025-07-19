
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ;i<n ;i++){
            arr[i] = scanner.nextInt();
        }
        
        boolean isPalindrome=true; 

        for(int i = 0;i<n/2 ;i++){
            if(arr[i] != arr[n-1-i]){
                isPalindrome=false;
            }
        }
        if(isPalindrome){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
