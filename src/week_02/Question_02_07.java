package assignments.src.week_02;

import java.util.Scanner;

public class Question_02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");

        int number = input.nextInt();

        // bize dakika verilmiş
        // 1 saat 60 dakika 1 gün 24 saat = 1 gün 1440 dakika
        // 365*1440 da yılda kaç dakika olduğunu verir

        int yılDakikası = 365 * 1440;
        int yıl = number / yılDakikası;
        int kalanDakika = number % yılDakikası;
        int gün = kalanDakika / 1440;



        System.out.println(number + " minutes is approximately " + yıl + " years and " + gün + " days ");


    }


}
