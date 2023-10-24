package assignments.week_08;

import java.util.Scanner;

public class Question_08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row and columns of the array:");
        int row = input.nextInt();
        int column = input.nextInt();

        double[][] array = new double[row][column];

        System.out.print("Enter the arrays: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        int[] location = locateLargest(array);
        System.out.println("The location of the largest element is at" +
                " (" + location[1] + ", " + location[0] + ")");

    }

    public static int[] locateLargest(double[][] a) {
        int[] location = new int[2];
        double largest = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > largest) {
                    location[0] = i;
                    location[1] = j;

                }
            }
        }
        return location;
    }

}
