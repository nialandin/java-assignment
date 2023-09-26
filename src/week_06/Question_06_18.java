package assignments.src.week_06;

import java.util.Scanner;

public class Question_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
sadece harf ve rakam koşulu ?!?!?
rakam olduğunu nasıl kontrol edebilirim..?
charla bakmam lazım
digit ve harf sayacı oluşturmalıyım
harflere bakmak için char ile tek tek passwordün karakterlerine bakacağım

 */

        System.out.println("Enter a password:");
        String password = input.next();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValidPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        int letterCount = 0;
        int digitCount = 0;

        //döngü içeirisince karakterleri inceledim. rakam iseler digitcountu arttırdım.
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (!(Character.isLetterOrDigit(ch))) {
                return false;
            }

            if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                letterCount++;
            }
        }
        if (digitCount < 2) {
            return false;
        }
        return true;

    }
}
