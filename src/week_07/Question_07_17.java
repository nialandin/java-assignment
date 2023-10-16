package assignments.src.week_07;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Question_07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students :");
        int number = input.nextInt();

        String[] names = new String[number];
        int[] scores = new int[number];

        for (int i = 1; i < number; i++) {
            System.out.println("Enter the name a score for each student:");

            System.out.print("Student " + i + " :");
            names[i] = input.next();
            System.out.print("Score : ");
            scores[i] = input.nextInt();
        }
        sortStudentsByScore(names, scores);

        for (int i = 0; i < number; i++) {
            System.out.println(names[i]);

        }

    }

    public static void sortStudentsByScore(String[] name, int[] score) {
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = i + 1; j < score.length; j++) {
                if (score[j] > score[i]) {
                    int tempScore = score[i];
                    score[i] = score[j];
                    score[j] = tempScore;

                    String tempName = name[i];
                    name[i] = name[j];
                    name[j] = tempName;
                }
            }
        }
    }
}
