package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten values of double type : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        int minIndex = indexOfSmallestElement(numbers);
        System.out.printf("\nThe minimum number is %.2f index %d", numbers[indexOfSmallestElement(numbers)], minIndex);

    }

    public static int indexOfSmallestElement(double[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}// 1 2 4,1 2 7 5,4 23 1 3,1 9
