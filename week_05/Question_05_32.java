package assignments.week_05;

import java.util.Scanner;

public class Question_05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * iki basamaklı sayı girdisi
         *  eşleşme olursa 10.000 kazanıyor             /user = ab  pc = ab
         *  basamak yerleri değişikse 3000 kazanıyor    /user = ba  pc = ab
         *  sadece tek basamak tutarsa 1000 kazanıyor   /user bc veya ac gibi
         */

        System.out.println("Enter your lottery pick (two distinct digits) : ");
        int userNumber = input.nextInt();


        int firstDigit = (int) (Math.random() * 10);
        int secondDigit = 0;
        while (secondDigit == 0) {
            secondDigit = (int) (Math.random() * 10);
        }
        int lotteryNumber = firstDigit * 10 + secondDigit;
        System.out.println("The lottery number is " + lotteryNumber);


        int userDigit2 = userNumber % 10;  //2
        int userDigit1 = userNumber / 10;

        int lotteryDigit2 = lotteryNumber % 10;  //2
        int lotteryDigit1 = lotteryNumber / 10;


        if (userNumber == lotteryNumber) {
            System.out.println("You win $10,000");
        } else if (userDigit1 == lotteryDigit1 || userDigit1 == lotteryDigit2) {
            System.out.println("You win $3,000");
        } else if (userDigit2 == lotteryDigit1 || userDigit2 == lotteryDigit2) {
            System.out.println("You win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }


    }
}