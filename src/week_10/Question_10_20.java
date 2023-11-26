package assignments.week_10;

import java.math.BigDecimal;

public class Question_10_20 {
    public static void main(String[] args) {
        System.out.println("The e values for i = 100 to 1000:");
        System.out.printf("%-15s      %-15s%n", "i", "e");
        System.out.println("----------------------------------");
        for (int i = 100; i < 1000; i += 100) {
            BigDecimal eApproximation = BigDecimal.ONE;
            BigDecimal factorial = BigDecimal.ONE;
            for (int j = 1; j <= i; j++) {
                factorial = factorial.multiply(BigDecimal.valueOf(j));
                eApproximation = eApproximation.add(BigDecimal.ONE.divide(factorial, 25, BigDecimal.ROUND_HALF_UP));

            }
            System.out.println(i + "    " + eApproximation);


        }
    }

}
