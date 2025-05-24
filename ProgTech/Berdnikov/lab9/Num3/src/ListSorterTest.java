import java.util.ArrayList;
import java.util.Scanner;

public class ListSorterTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer size = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.printf("Введите %d целых чисел:\n", size);

        for (int i = 0; i < size; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Некорректный ввод. Введите целое число: ");
                scanner.next();
            }
            numbers.add(scanner.nextInt());
        }

        ListSorter.sort(numbers);

        System.out.println("Числа в порядке возрастания:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}