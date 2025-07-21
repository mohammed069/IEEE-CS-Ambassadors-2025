
import java.util.Scanner;

public class L {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        concat(A,B,N);
    }

    public static void concat(int[] A,int[] B, int N){
        int[] C = new int[2*N];

        for(int i=0 ;i<N;i++){
            C[i]=B[i];
            C[N+i]=A[i];
        }

        for (int i =0;i<2*N;i++){
            System.out.print(C[i]+" ");
        }

    }

}
