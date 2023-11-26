package assignments.week_10;

import java.util.Scanner;

public class Question_10_05 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        StackOfIntegers factors = new StackOfIntegers();

        int divisor = 2;
        while (number > 1) {
            if (number % divisor == 0) {
                factors.push(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }

        System.out.print("Decreasing order: ");
        while (!factors.isEmpty()) {
            System.out.print(factors.pop() + " ");
        }
    }
}
