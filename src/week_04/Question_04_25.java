package assignments.week_04_;

import java.util.Scanner;

public class Question_04_25 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        char l1 = (char) ((Math.random() * 26) + 65);
        char l2 = (char) ((Math.random() * 26) + 65);
        char l3 = (char) ((Math.random() * 26) + 65);

        int l4 = (int) ((Math.random() * 9000) + 1000);

        System.out.printf("Generated plate number : %c%c%c%d", l1, l2, l3, l4);

    }

}
