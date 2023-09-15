package assignments.week_05;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ders {

    public static void main(String[] args) {



        /*
        6 = 1+3+2
        8 = 1+2+4 -> 7 / negative
         */

        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int number = 1; number < 10000; number++) {
            sum = 0;
            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
            }
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
