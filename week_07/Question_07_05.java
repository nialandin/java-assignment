package assignments.src.week_07;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int count = 0;

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            if (numbers[number] == 0) {
                numbers[number]++;
                count++;
            }
        }
        System.out.println("The number of distinct number is " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }
}
