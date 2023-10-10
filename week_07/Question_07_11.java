package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten values of double type : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        double meanValue = mean(numbers);
        double deviationValue = deviation(numbers);

        System.out.println("The mean is " + meanValue);
        System.out.println("The standard deviation is " + deviationValue);

    }

    public static double deviation(double[] x) {
        double meanValue = mean(x);
        double sumOfSquares = 0.0;

        for (int i = 0; i < x.length; i++) {
            sumOfSquares += Math.pow(x[i] - meanValue, 2);
        }
        double deviationValue = Math.sqrt(sumOfSquares / x.length);
        return deviationValue;
    }

    public static double mean(double[] x) {
        double sum = 0.0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        double meanValue = sum / x.length;
        return meanValue;
    }
//1,9 2,5 3,7 2 1 6 3 4 5 2
}