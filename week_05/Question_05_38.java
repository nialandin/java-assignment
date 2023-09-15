package assignments.week_05;

import java.util.Scanner;

public class Question_05_38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a decimial interger : ");
        int decimal = input.nextInt();



        // kalan = ikinci basamak / kalan2=birinci basamak

        while ( decimal > 0 ) {
            int kalan = decimal % 8; //14/8=1 ->6
            int bölüm = decimal / 8;//1/8=0  ->1
            int kalan2 = bölüm % 8;

            if (bölüm == 0 ) {
                System.out.println(bölüm+kalan);
            } else {
                System.out.println(kalan+kalan2);
            }

        }

    }
}
