package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten values of double type : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double[] reversedNumbers = reverseArray(numbers);

        for (double number : reversedNumbers) {
            System.out.println(number + " ");
        }

    }

    public static double[] reverseArray(double[] array) {
        double[] reversedArray = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
}
