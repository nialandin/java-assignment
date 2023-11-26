package assignments.week_10;

import java.math.BigInteger;

public class deneme {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        int count = 0;


        while (count < 5) {
            boolean isPrime = true;
            for (BigInteger divider = new BigInteger("2"); !divider.equals(number.divide(BigInteger.TWO)); divider = divider.add(BigInteger.ONE)) {
                if (number.divide(divider).equals(BigInteger.ZERO)) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
                count++;
            }

            number = number.add(new BigInteger("1"));


        }
    }
}


