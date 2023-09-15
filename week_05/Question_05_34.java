package assignments.week_05;

import java.util.Scanner;

public class Question_05_34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


            /* makas = 0 | taş = 1 | paper = 2
               0 2    +2 yener
               0 1    +1 yenilir
               1 0    -1 yener aslında 2 0 / 2ye yener
               1 2    +1 yenilir
               2 1    +2 yener
               2 0    +1 yenilir
               */


        int userWin = 0;
        int pcWin = 0;


        while (userWin < pcWin * 2 + 2 || pcWin < userWin * 2 + 2) {
            System.out.println("scissor (0), rock(1), paper(2) :");
            int userRandom = input.nextInt();

            String userRandomName = " ";
            String pcRandomName = " ";
            int pcRandom = (int) (Math.random() * 3);
            switch (userRandom) {
                case 0:
                    userRandomName = "scissor";
                    break;
                case 1:
                    userRandomName = "rock";
                    break;
                case 2:
                    userRandomName = "paper";
                    break;
            }


            switch (pcRandom) {
                case 0:
                    pcRandomName = "scissor";
                    break;
                case 1:
                    pcRandomName = "rock";
                    break;
                case 2:
                    pcRandomName = "paper";
                    break;
            }

            if (pcRandom == userRandom) {
                System.out.printf("The computer is %s. You are %s too. It is a draw", pcRandomName, userRandomName);
                System.out.println("\nComputer win : " + pcWin);
                System.out.println("User win : " + userWin);
            } else if (userRandom == pcRandom + 1 || userRandom == pcRandom - 2) {
                System.out.printf("The computer is %s. You are %s. You won", pcRandomName, userRandomName);
                userWin++;
                System.out.println("\nComputer win : " + pcWin);
                System.out.println("User win : " + userWin);
            } else {
                System.out.printf("The computer is %s. You are %s . You lose", pcRandomName, userRandomName);
                pcWin++;
                System.out.println("\nComputer win : " + pcWin);
                System.out.println("User win : " + userWin);
            }


        }


    }
}
