package assignments.week_08;

import java.util.Scanner;

public class Question_08_29_dön {
    public static void main(String[] args) {

            System.out.print("Enter list1: ");
            int list1[][] = initializeMatrix();
            System.out.print("Enter list2: ");
            int list2[][] = initializeMatrix();

            equals(list1, list2);


        }

            public static boolean equals(int[][] m1, int[][] m2) {
            if (m1.length != m2.length || m1[0].length != m2[0].length ) {
                System.out.println("The two arrays are not strictly identical");
                return false;
            }

            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    if (m1[i][j] != m2[i][j]) {
                        System.out.println("The two arrays are not strictly identical");
                        return false;
                    }
                }
            }
            System.out.println("The two arrays are strictly identical");
            return true;

        }


            public static int[][] initializeMatrix() {
            Scanner input = new Scanner(System.in);

            int[][] m1 = new int[3][3];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    m1[i][j] = input.nextInt();
                }
            }


            return m1;
        }
        /*
            1 2 3 4 5 6 7 8 9
        */


}
