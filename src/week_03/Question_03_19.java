package assignments.src.week_03;

import java.util.Scanner;

public class Question_03_19 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three edges of the triangle :");

        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();

        if (t1 + t2 < t3) {
            System.out.println("The input is invalid");
        } else if (t1 + t3 < t2) {
            System.out.println("The input is invalid");
        } else if (t2 + t3 < t1) {
            System.out.println("The input is invalid");
        } else {
            System.out.println("The perimeter is " + (t1 + t2 + t3));
        }
    }
}
