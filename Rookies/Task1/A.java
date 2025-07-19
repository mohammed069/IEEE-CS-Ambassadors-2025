
import java.util.Scanner;
 
public class A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            int x = scanner.nextInt();
            sum += x;
        }
        System.out.println(Math.abs(sum));
    }
}