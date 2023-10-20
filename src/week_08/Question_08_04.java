package assignments.src.week_08;

import java.util.Scanner;

public class Question_08_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix1: ");
        int count1 = 0;
        double matris1[][] = new double[3][3];
        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                matris1[i][j] = input.nextDouble();
            }
        }


        System.out.print("Enter matrix2: ");
        int count2 = 0;
        double matris2[][] = new double[3][3];
        for (int i = 0; i < matris2.length; i++) {
            for (int j = 0; j < matris2[0].length; j++) {
                matris2[i][j] = input.nextDouble();
            }
        }


        // matrisleri kullanıcıya yazdırdım
        //matrisleri toplamak için method çağıracağım

        double[][] totalMatrix = addMatrix(matris2, matris1);

        //matrisleri topladım toplamlarını ekrana yazdırmam lazım

        System.out.println("The matrices are added as follows ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                count1++;
                System.out.print(matris1[i][j]+" ");
                if (count1 % 3 == 0) {
                    System.out.println();
                }
                System.out.print(" + ");
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                count2++;
                System.out.println(matris2[i][j]+" ");
                if (count1 % 3 == 0) {
                    System.out.println();
                }
            }
        }

        // + " "  + matris2[i][j] + " = " + totalMatrix[i][j] + " ");


        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //  System.out.print(matris1[i][j] + " + " + matris2[i][j] + " = " + totalMatrix[i][j] + " ");
                System.out.println(matris2[i][j] + " ");
            }
        }
        System.out.println(" = ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //  System.out.print(matris1[i][j] + " + " + matris2[i][j] + " = " + totalMatrix[i][j] + " ");
                System.out.println("\n" + totalMatrix[i][j] + " ");
            }
        }*/
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

