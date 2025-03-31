import java.util.Scanner;

public class LargestElementFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк и столбцов массива: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        double[][] array = new double[rows][columns];

        System.out.println("Введите массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        Location location = Location.locateLargest(array);

        if (location != null) {
            System.out.printf("Наибольший элемент массива, равный %.1f, находится в позиции (%d, %d)\n",
                    location.getMaxValue(), location.getRow(), location.getColumn());
        } else {
            System.out.println("Массив пуст.");
        }

        scanner.close();
    }
}