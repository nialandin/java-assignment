package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        double startTime = System.currentTimeMillis();

        while (true) {

            int n1 = (int) (Math.random() * 15) + 1;
            int n2 = (int) (Math.random() * 15) + 1;
            int sum = n1 + n2;

            System.out.printf("\nWhat is %d + %d ? ", n1, n2);
            int guess = input.nextInt();
            if (guess == 'q') {
                break;
            }


            if (guess == sum) {
                System.out.println("You are correct!");
                count++;

            } else {
                System.out.printf("You answer is wrong. \n%d + %d should be %d\n", n1, n2, sum);
            }

            if (guess == sum) {
                System.out.printf("%d+%d=%d correct", n1, n2, guess);
            } else {
                System.out.printf("%d+%d=%d wrong", n1, n2, guess);
            }

        }
        double totalTime = (System.currentTimeMillis() - startTime ) / 1000;
        System.out.printf("Test time is %.0f seconds ", totalTime);
        System.out.println("Correct count is " + count);


    }
}

