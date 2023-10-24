package assignments.week_08;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        shuffle(m);

        printMatrix(m);

    }

    public static void shuffle(int[][] m) {

        int numRows = m.length;

        for (int i = numRows - 1; i >= 0; i--) {
            int random = (int) (Math.random() * (i + 1));

            int[]temp = m[i];
            m[i] = m[random];
            m[random] = temp;
        }
    }

    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
