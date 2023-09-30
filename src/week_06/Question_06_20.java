package assignments.src.week_06;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question_06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        metot yazmamız isteniyor
        girilen karakterdeki harf sayısını hesaplaması gerek

        girdi: nialand

        girdiyi tek tek char ile kontrol etmeli
        eğer harf ise bunu counta ekleyecek
         */

        System.out.print("Enter a string :");
        String str = input.nextLine();

        System.out.printf("The number of letters in the string '%s' : %d ", str, countLetters(str));

    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }


}
