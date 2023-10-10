package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int number = input.nextInt();
        int[] scores = new int[number];

        System.out.printf("Enter %d scores: ", number);
        for (int i = 0; i < number; i++) {
            scores[i] = input.nextInt();
        }
        int best = findBestScore(scores);

        for (int i = 0; i < number; i++) {
            int score = scores[i];
            System.out.printf("Student %d score is %d and grade is %s\n", i + 1, score, findGrade(score, best));
        }
    }

    public static String findGrade(int score, int best) {
        if (score >= best - 10) {
            return "A";
        }
        if (score >= best - 20) {
            return "B";
        }
        if (score >= best - 30) {
            return "C";
        }
        if (score >= best - 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public static int findBestScore(int[] score) {
        int best = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > best) {
                best = score[i];
            }
        }
        return best;
    }
}
