package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        selectionSort(numbers);

        for (double number : numbers) {
            System.out.print(number + " ");
        }

    }

    public static void selectionSort(double[] numbers) {
        for (int i = numbers.length - 1; i >= 1; i--) {
            int maxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (numbers[j] > numbers[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                double temp = numbers[i];
                numbers[i] = numbers[maxIndex];
                numbers[maxIndex] = temp;
            }
        }
    }
}
