package assignments.src.week_03;

import java.util.Scanner;

public class Question_03_17 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2):");
        int number = input.nextInt();

        int computer = (int) (Math.random() * 3);


        switch (number) {
            case 0:
                System.out.println("You are scissor");
                break;
            case 1:
                System.out.println("You are rock");
                break;
            case 2:
                System.out.println("You are paper");
                break;

        }
        switch (computer) {
            case 0:
                System.out.println("The computer is scissor");
                break;
            case 1:
                System.out.println("The computer is rock");
                break;
            case 2:
                System.out.println("The computer is paper");
                break;
        }

/* 0=makas  1=taş 2=kağıt
    0 2 yi yener   0, 1 e yenilir
    1 0 ı yener    1  2 ye yenilir
    2 1  i yener   2  0 a yenilir
*/
        if (number == computer) {
            System.out.println(" İt is a draw");
        } else if (number == computer + 1 || number == computer - 2) {
            System.out.print("You won.");
        } else System.out.print("Computer won.");

    }

}
