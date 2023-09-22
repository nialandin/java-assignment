package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //koşul ? doğruDurum : yanlısDurum - hatırlatma formul

        System.out.println("Enter a integer : ");
        int number = input.nextInt();
        System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
    }
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

}
