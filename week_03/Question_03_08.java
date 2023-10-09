package assignments.src.week_03;

import java.util.Scanner;

public class Question_03_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 integers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        /*
        3 sayımızdan ilk önce ikisini koşullandırarak işledik eğer böyleyse eğer yine böyleyse o zaman yazılacak bu dedik




        */
        if (number1 <= number2 && number1 <= number3) {
            if (number2 <= number3) {
                System.out.println(number1 + " < " + number2 + " < " + number3);
            } else {
                System.out.println(number1 + " <= " + number3 + " <= " + number2);
            }

        } else if (number2 <= number1 && number2 <= number3) {
            if (number1 <= number3) {
                System.out.println(number2 + " < " + number1 + " < " + number3);
            } else {
                System.out.println(number2 + " < " + number3 + " < " + number1);
            }

        } else {
            if (number1 < number2) {
                System.out.println(number3 + " < " + number1 + " < " + number2);
            } else {
                System.out.println(number3 + " < " + number2 + " < " + number1);
            }

        }

    }

}







