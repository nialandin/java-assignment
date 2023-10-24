package assignments.week_08;

import java.util.Scanner;

public class Question_08_05 {
    public static void main(String[] args) {

        System.out.print("Enter matrix1: ");
        double matrix1[][] = initializeMatrix();
        System.out.print("Enter matrix2: ");
        double matrix2[][] = initializeMatrix();

        // matrisleri kullanıcıya yazdırdım
        //matrisleri toplamak için method çağıracağım
        double[][] totalMatrix = addMatrix(matrix2, matrix1);//çağırdım

        //matrisleri topladım toplamlarını ekrana yazdırmam lazım
        displayTotalMatrix(matrix1, matrix2, totalMatrix);//yapıldı

    }

    private static void displayTotalMatrix(double[][] matrix1, double[][] matrix2, double[][] totalMatrix) {
        System.out.println("The matrices are added as follows ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix1[i][0] + " " + matrix1[i][1] + " " + matrix1[i][2] + "    " + (i == 1 ? "\b+" : "") + "    ");
            System.out.print(matrix2[i][0] + " " + matrix2[i][1] + " " + matrix2[i][2] + "    " + (i == 1 ? "\b=" : "") + "    ");
            System.out.print(totalMatrix[i][0] + " " + totalMatrix[i][1] + " " + totalMatrix[i][2] + "        ");
            System.out.println();
            if (i == 2) {
                System.out.println();
            }
        }
    }

    private static double[][] initializeMatrix() {
        Scanner input = new Scanner(System.in);
        int count1 = 0;
        double matrix[][] = new double[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        int row = a.length;
        int column = a[0].length;

        double[][] total = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                total[i][j] = a[i][j] + b[i][j];
            }
        }
        return total;
    }
}

/*
1 2 3 4 5 6 7 8 9

0 2 4 1 4,5 2,2 1,1 4,3 5,2
*/

