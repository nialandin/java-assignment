package assignments.week_09;

import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {
        Random random = new Random(1000);

        for (int i = 0; i <= 50; i++) {
            int randomNumber = random.nextInt(101);

            if (i % 10 == 0 ){
                System.out.println( randomNumber  );
            }else {
                System.out.print( randomNumber +" ");

            }
        }
    }
}