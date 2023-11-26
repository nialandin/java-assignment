package assignments.week_10;

import java.math.BigInteger;

public class Question_10_16 {

    public static void main(String[] args) {
        BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000");        int count = 0;
        while (count < 10) {
            if (isDivisible(number)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }

    public static boolean isDivisible(BigInteger number) {
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");

        return number.mod(two).equals(BigInteger.ZERO) || number.mod(three).equals(BigInteger.ZERO);
    }
}