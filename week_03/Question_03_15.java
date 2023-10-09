package assignments.src.week_03;

import java.util.Scanner;

public class Question_03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int) (Math.random() * 900) + 100;

        System.out.println("Enter your lottery pick (three digits ) : ");
        int guess = input.nextInt();

        int guessDigit1 = guess / 100;
        int reminder = guess % 100;
        int guessDigit2 = reminder / 10;
        int guessDigit3 = reminder % 10;


        if (guess == lottery) {
            System.out.println("Match lottery numbers in exact order. Your prize is $10,000.");
        }


        System.out.println(guessDigit1 + "  " + guessDigit2 + "  " + " " + guessDigit3);


    }
}
