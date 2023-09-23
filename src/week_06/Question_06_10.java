package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        for (int i = 2; i < 10000; i++) {
            if (isPrime(i))
            count++;
        }
        System.out.println("The number of prime numbers less than 10,000 is : " + count);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
boolean isPrime=true;
        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
               return false;
            }
        }
        return true;
    }
}
/*
asal sayı kendisine ve 1'e bölümünden sıfır kalır
eğer başka bir sayıya bölünürse asal olmaz
just 1 ve kendisine bölünecek
 */