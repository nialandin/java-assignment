package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        on tane sayı girmesini isteyeceğiz
        arraylerle on girdilik şey tanımlayacağım

         */
        System.out.print("Enter ten integers: ");
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Number reversed:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}//1 2 3 4 5 6 7 8 9 10
