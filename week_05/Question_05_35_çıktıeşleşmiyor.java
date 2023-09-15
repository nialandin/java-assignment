package assignments.week_05;

import java.util.Scanner;

public class Question_05_35 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sum = 0.0;


        for (int i = 2; i < 626; i++) {

            for (int j = 1; j < i; j++) {


                double formal = 1.0 / (Math.sqrt(i) + Math.sqrt(j));
                sum ++;
            }
        }
        System.out.println(sum);

    }
}