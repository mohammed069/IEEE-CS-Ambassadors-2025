

import java.util.ArrayList;
import java.util.Scanner;

public class L{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        for(int k=0;k<repeat;k++){
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0 ;i<n ;i++){
            arr[i] = scanner.nextInt();
        }


        ArrayList<Integer> result = new ArrayList<>();
        for (int len = 1; len <= n; len++) {
                for (int i = 0; i <= n - len; i++) {
                    int max = arr[i];
                    for (int j = i + 1; j < i + len; j++) {
                        max = Math.max(max, arr[j]);
                    }
                    result.add(max);
                }
        }
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    }
}

