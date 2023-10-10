package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[100];
        int count = 0;
        int total = 0;
        double average = 0;
        int aboveAverageCount = 0;
        int belowAverageCount = 0;


        System.out.println("Enter scores: (negative number signifies end): ");
        int score = input.nextInt();
        while (score >= 0 && count < 100) {

            scores[count] = score;
            total += score;
            count++;
            score = input.nextInt();
        }
        average = (double) total / count;

        for (int j = 0; j < count; j++) {
            if (scores[j] >= average) {
                aboveAverageCount++;
            } else {
                belowAverageCount++;
            }
        }

        System.out.println("Average of scores: " + average);
        System.out.println("Number of scores above or equal to average: " + aboveAverageCount);
        System.out.println("Number of scores below average :" + belowAverageCount);

    }
}
