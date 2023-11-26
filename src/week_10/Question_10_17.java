package assignments.week_10;
import java.math.BigInteger;

public class Question_10_17 {
        public static void main(String[] args) {
            BigInteger maxLongValue = BigInteger.valueOf(Long.MAX_VALUE);
            BigInteger number = sqrt(maxLongValue).add(BigInteger.ONE); // Long.MAX_VALUE'nin karekökünü alıp bir artırıyoruz

            int count = 0;
            while (count < 10) {
                BigInteger square = number.multiply(number);
                System.out.println(square);
                number = number.add(BigInteger.ONE);
                count++;
            }
        }
        public static BigInteger sqrt(BigInteger n) {
            BigInteger a = BigInteger.ONE;
            BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
            while (b.compareTo(a) >= 0) {
                BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
                if (mid.multiply(mid).compareTo(n) > 0)
                    b = mid.subtract(BigInteger.ONE);
                else
                    a = mid.add(BigInteger.ONE);
            }
            return a.subtract(BigInteger.ONE);
        }
    }


