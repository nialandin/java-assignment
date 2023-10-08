package assignments.src.week_02;

import java.util.Scanner;

public class Question_02_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F : ");
        double temperature = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour : ");
        double windSpeed = input.nextDouble();


        /*
        burada 𝑡, Fahrenheit cinsinden ölçülen dış sıcaklıktır ve v, mil/saat cinsinden ölçülen rüzgar hızıdır.
        𝑡, rüzgar hissedilen sıcaklığıdır.
        Formülde 𝑤𝑐, 2 mph'nin altındaki rüzgar hızları veya -58 ºF'den düşük sıcaklıklar veya 41ºF'den yüksek sıcaklıklar için kullanılamaz.




         */
        double formula = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);


        System.out.println("The wind chill index is" + formula);


    }

}