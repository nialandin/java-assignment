package week_05.nias;

import java.util.Scanner;

public class Question_05_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        /**
         * amacım ascii sayılarını ilk önce normal yazdırmak
         * sonra bunları satırlara bölerek yazdırmak
         *
         * ascii de = 33 - 90 (büyük
         *          = 97 - 122 (küçük
         *          = 123 - 126 (sembol
         *          ben ilk asciideğerlerini yazmıştım fakat tırnak içinde
         *          karakterleri yazmak daha mantıklı = for (char i =33 ; i <= 126; i++)
         */

        int count = 0;
        for (char i = '!'; i <= '~'; i++) {
            System.out.print(i + " ");

            count++;

            if (count % 10 == 0) {
                System.out.println();
            }
        }


    }

}
