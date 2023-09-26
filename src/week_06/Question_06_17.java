package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int number = input.nextInt();

        printMatrix(number);

        /*
           girdi sayı kadar satır oluşturulacak
           girdi kadar da sayı oluşturacak

         */
    }

    public static void printMatrix(int n) {


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int random = (int) (Math.random() * 2);
                System.out.print(random + " ");
            }
            System.out.println();

        }
    }
}
