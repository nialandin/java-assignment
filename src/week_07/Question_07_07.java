package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_07 {
    public static void main(String[] args) {
        int[] counts = new int[10];

        for (int i = 0; i < 100; i++) {
            int randomNumber = (int) (Math.random() * 10);
            counts[randomNumber]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%d%s: %d%n", i, "s", counts[i]);
        }
    }
}