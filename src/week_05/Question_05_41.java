package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int maxCount = 0;

        while (true) {
            System.out.println("Enter integers ( it ends with input of 0 ) :");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }
            if (number > max) {
                max = number;
maxCount=1;
            }
            if (number == max) {
                maxCount++;
            }
        }
        System.out.println("The largest count 7 and the occurrence of the count is " + (maxCount-1));
    }
}
