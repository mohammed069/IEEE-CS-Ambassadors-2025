import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        shiftZeros(numbers);
    }

    public static void shiftZeros (int[] numbers){
        int index=0;

        for(int i =0 ;i<numbers.length ;i++){
            if(numbers[i] != 0){
                numbers[index++] = numbers[i]; 
            }


        }

        while (index<numbers.length){
            numbers[index++]=0;
        }

        for(int number :numbers){
            System.out.print(number);
        }

    }
    
}
