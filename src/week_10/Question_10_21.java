package assignments.week_10;

import java.math.BigInteger;

public class Question_10_21 {
    /*  public static void main(String[] args) {
          long number = Long.MAX_VALUE + 1 ;
          int count = 0;
           while ( count < 10 ) {
               number++;
           }

           while (count < 10 ) {
               if (number % 5 == 0 || number % 6 == 0) {
                   System.out.println(number);
                   count++;
               }
               number ++;
           }
      }
  }*/
    public static void main(String[] args) {
        BigInteger number = new BigInteger(String.valueOf(Long.MAX_VALUE)).add(BigInteger.ONE);
        int count = 0;
        int limit = 10;

        while (count < limit) {
            if (number.remainder(BigInteger.valueOf(5)).equals(BigInteger.ZERO) ||
                    number.remainder(BigInteger.valueOf(6)).equals(BigInteger.ZERO)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
