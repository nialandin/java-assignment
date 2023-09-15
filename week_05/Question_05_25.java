package assignments.week_05;

import java.util.Scanner;

public class Question_05_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double number = 0;
        for (int i = 1; i <= 100000; i+=10000) {


            // formulün parantez kısmını yapıyorum

            number += Math.pow(-1, i + 1) / (2 * i - 1);


            if (i == 10000) {
                System.out.println("PI value for i = 10000 :" + (4 * number));
            }
            if (i == 20000) {
                System.out.println("PI value for i = 20000 :" + (4 * number));
            }
            if (i == 100000) {
                System.out.println("PI value for i = 100000 :" + (4 * number));
            }

        }


    }
}
