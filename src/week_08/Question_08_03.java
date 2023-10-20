package assignments.src.week_08;

import java.util.Scanner;

public class Question_08_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] studentAnswers = {
                {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
                {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
                {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
                {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}
        };

        String[] key = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        numberOfCorrect(studentAnswers, key);
    }

    public static void numberOfCorrect(String studentAnswers[][], String key[]) {
        int count = 0;

        int[] counts = new int[studentAnswers.length];


        for (int i = 0; i < studentAnswers.length; i++) {
            count = 0;
            for (int j = 0; j < studentAnswers[0].length; j++) {
                if (studentAnswers[i][j].equals(key[j])) {
                    count++;
                }
            }
            counts[i] = count;
        }
        for (int i = 0; i < counts.length - 1; i++) {
            for (int j = 0; j < counts.length - i - 1; j++) {
                if (counts[j] < counts[j + 1]) {
                    // Sayıları yer değiştir
                    int temp = counts[j];
                    counts[j] = counts[j + 1];
                    counts[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("Student %d's correct count is %d%n", i, counts[i]);
        }
    }
}


