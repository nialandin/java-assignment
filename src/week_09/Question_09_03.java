package assignments.week_09;

import java.util.Date;

public class Question_09_03 {
    public static void main(String[] args) {
        long[] elapsedTimes = {10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L};

        for (long elapsedTime : elapsedTimes) {
            Date date = new Date(elapsedTime);
            System.out.println(date);
        }

    }
}
