package assignments.src.week_02;

import java.util.Scanner;

public class Question_02_06 {
    public static void main (String [] args ) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000:");
        int number = input.nextInt();
        int basamak3 = number % 10;
        // 2 buluyoruz ve bu bizim rakamımız
        int numberikincihali = number / 10 ;
        // 932 /10 = 93.2 yani 93

        int basamak2 = numberikincihali % 10 ;
        // 93 ün modunu buluyor kalan 3 bu bizim ikinci rakamımız

        int numberüçüncühali = numberikincihali / 10;
        // 3.hal ise 93 bölü 10 = 9.3

        // numberi modunu alıp 102a bölerek basamağını gösteriyoruz
        int basamak1 = numberüçüncühali % 10 ;





        System.out.println("The sum of the digits is " + (basamak1+basamak2+basamak3));


    }
}
