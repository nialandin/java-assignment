package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        System.out.println("All the leap years from t101 to 2100: ");

        for (int i = 101; i <= 2100; i++) {


            //if ((i % 4 == 0) && (( i % 100 != 0) || (i % 400 == 0))) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {

                    System.out.print(i + " ");
                    count++;

                if (count % 10 == 0) {
                    System.out.println();
                }


            }

        }

    }
}