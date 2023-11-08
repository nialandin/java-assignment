package assignments.week_09;

public class StopWatchTest {
    public static void main(String[] args) {
    int[] numbers = generateNumbers (100000);
    StopWatch stopWatch = new StopWatch();
    selectionSort (numbers);
    stopWatch.stop();

    long elepsedTime = stopWatch.getElapsedTime();
        System.out.println("The execution time of sorting 100,000 numbers using selection sort: " + elepsedTime + " milliseconds");
    }
    public static int[] generateNumbers(int count) {
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

}
