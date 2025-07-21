

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        
        double[] numbers = new double[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextDouble();
        }

        calcAverage(numbers);


    }

    public static void calcAverage(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        System.out.printf("%.6f\n", average);
    }
    
}
