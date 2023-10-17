package assignments.src.week_08;

import java.util.Scanner;

public class Question_08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix= new double[3][4];

        System.out.println("Enter 3-by-4 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            double columnSum = sumColumn(matrix,i);
            System.out.println("Sum of the elements at column " + i + " is "+ columnSum);
        }
    }
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

}
