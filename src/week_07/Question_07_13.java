package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter ten numbers to exclude from random (1-54) : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Number generated : " + getRandom(numbers));
    }

    public static int getRandom(int[] numbers) {
        int random = (int) (Math.random() * 54) + 1;
        for (int i = 0; i < numbers.length; i++) {
            if (random == numbers[i]) {
                random = (int) (Math.random() * 54) + 1;
                i = 0;
            }
        }
        return random;
    }
}