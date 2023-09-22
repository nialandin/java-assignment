package assignments.src.week_05;

import java.util.Scanner;

public class Question_05_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    /*
    bizden sayının ekokunu istiyor
    en küçük çarpanları bulmak için sayıyı böleriz
    bölünebildiği kadar denememiz lazım

    bir verir ve bölünebildiği sayıları arttırmasını isteriz böylece bölen sayıları bulur
    fakat artan sıra ile nasıl yazdıracağını bilemiyorum

sayıyı tek tek bölmesi gerek



     */

        System.out.print("Enter an integer : ");
        int i = input.nextInt();


        int div = 2;

        while (div <= i) {

            if (i % div == 0) {
                System.out.print(div + ", ");
                i = i / div;
            } else if (i % div != 0) {
                div++;

            }

        }
        System.out.println("\b\b.");

    }
}
