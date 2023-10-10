package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten values of double type : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double minValue = min(numbers);
        System.out.println("The minimum number is :" + minValue);

    }

    public static double min(double[] array) {
        double minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}