package assignments.src.week_05;

public class Question_05_43 {
    public static void main(String[] args) {

        /*
        1 1,2,3,4,5,6,7
        2 2,3,4,5,6,7
        3 3,4,5,6,7

        kendisinden küçüklerden başlamayarak tekrarlamamış oluyor
         */
        int count = 0;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1 + i; j <= 7; j++) {
                System.out.println(i + " " + j);
                count++;

                if (i == j) {

                }
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}
