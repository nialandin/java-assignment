package assignments.week_03;

import java.util.Scanner;

public class Question_03_24 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int card = (int) (Math.random() * 12) + 1;
        String card1 = " ";


        switch (card) {
            case 1:
                card1 = "Ace";
                break;
            case 11:
                card1 = "Jack";
                break;
            case 12:
                card1 = "Queen";
                break;
            case 13:
                card1 = "King";
                break;
            default:
                card1 = card + "";


        }
        int suit = (int) ((Math.random() * 4) + 1);
        String suit1 = " ";

        switch (suit) {
            case 1:
                suit1 = "Clubs";
                break;
            case 2:
                suit1 = "Diamonds";
                break;
            case 3:
                suit1 = "Hearts";
                break;
            case 4:
                suit1 = "Spades";
                break;
        }

        System.out.println("The card you picked is " + card1 + " of " + suit1);


    }
}
