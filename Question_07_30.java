package assignments.src.week_07;

import java.util.Scanner;

public class Question_07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values : ");
        int size = input.nextInt();
        int value[] = new int[size];

        System.out.print("Enter the values : ");
        for (int i = 0; i < size; i++) {
            value[i] = input.nextInt();
        }

        boolean hasConsecutiveFour = isConsecutiveFour(value);

        if (hasConsecutiveFour) {
            System.out.println("the list has consecutive fours");
        } else {
            System.out.println("the list has no consecutive fours");
        }

    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 1;

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i + 1]) {
                count++;

                if (count == 4) {
                    return true;
                }
            } else {
                count = 1;
            }
        }

        return false;
    }
}

