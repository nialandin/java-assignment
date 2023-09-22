package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_40 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfFlips = 1000000;
        int heads = 0;
        int tails = 0;


        for (int i = 0; i < numberOfFlips; i++) {
            int number = (int) (Math.random() * 2);

            if (number == 0) {
                heads++;
            } else {
                tails++;
            }

        }

        System.out.println("Fipping a coin one millon times...");
        System.out.println("Heads : " + heads);
        System.out.println("Tails : " + tails);


    }
}
