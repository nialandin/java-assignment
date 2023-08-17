package week_02;

import java.util.Scanner;

public class Question_02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//System.out.println("Enter the month");

/*   double interest = input.nextDouble();
        System.out.println("Enter the monthly saving amount : ");

        double amount = input.nextDouble();

        double interest = (1 + 0.05/12);
        double  month1 = amount * interest;
        double month2 = (amount + month1)* interest;

double formula = amount*interest*6;
System.out.println(formula);

*/
double aylikTasarrufMiktari = input.nextDouble();
double yillikFaizOrani =  0.00417;
        double aylıkFaizOrani = yillikFaizOrani / 12;
System.out.println(aylikTasarrufMiktari);

    }
}
