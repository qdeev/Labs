import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemoverTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Введите десять целых чисел: ");
        for (int i = 0; i < 10; i++) {
            while (!scanner.hasNextInt()) {
                System.out.print("Некорректный ввод. Введите целое число: ");
                scanner.next();
            }
            int input = scanner.nextInt();
            numbers.add(input);
        }

        DuplicateRemover.removeDuplicate(numbers);

        System.out.print("Несовпадающие целые числа равны ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
