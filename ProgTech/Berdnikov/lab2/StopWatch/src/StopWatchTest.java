import java.util.Random;

public class StopWatchTest {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        int size = 100_000;

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000000);
        }

        stopwatch.start();
        selectionSort(array);
        stopwatch.stop();

        System.out.println("Время выполнения сортировки выбором: " + stopwatch.getElapsedTime() + " мс");
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}