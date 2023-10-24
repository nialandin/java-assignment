package assignments.week_08;

public class Question_08_10 {
    // matrixleri yazdır
    // matrixleri sırala
    // çıktıyı ver

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findingRowColumn(int matrix[][]) {
        int maxRow = 0;
        int maxRowSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRow += matrix[i][j];
            }

            if (sumRow > maxRowSum) {
                maxRowSum = maxRow;
                maxRow = i;
            }
        }

        int maxColumn = 0;
        int maxColumnSum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            int columnSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                columnSum += matrix[i][j];
            }
            if (columnSum > maxColumnSum) {
                maxColumnSum = columnSum;
                maxColumn = j;
            }
        }
        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxColumn);

    }




    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        printMatrix(matrix);
findingRowColumn(matrix);

    }
}

