import java.util.ArrayList;
import java.util.Scanner;

public class SumTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer size = scanner.nextInt();
        ArrayList<Double> numbers = new ArrayList<>();

        System.out.printf("Введите %d чисел:\n", size);

        for (int i = 0; i < size; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            double input = scanner.nextDouble();
            numbers.add(input);
        }

        double total = SumCalculator.sum(numbers);

        System.out.println("Сумма введённых чисел: " + total);

        scanner.close();
    }
}