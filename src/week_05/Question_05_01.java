package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter an integer,the input ends if it is 0 :  ");
        int number = input.nextInt();

        int negative = 0;
        int positive = 0;
        double total = 0;
        int count = 0;

        while (number != 0) {
            if (number > 0) {
                positive++;
            } else {
                negative++;
            }
            total += number;
            count++;

            number = input.nextInt();


        }
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + (total / count));

        input.close();
    }

}

