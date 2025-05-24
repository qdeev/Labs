import java.util.ArrayList;
import java.util.Scanner;

public class ListUnionTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Введите пять целых чисел для списка1: ");
        for (int i = 0; i < 5; i++) {
            while (!scanner.hasNextInt()) {
                System.out.print("Некорректный ввод. Введите целое число: ");
                scanner.next();
            }
            list1.add(scanner.nextInt());
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Введите пять целых чисел для списка2: ");
        for (int i = 0; i < 5; i++) {
            while (!scanner.hasNextInt()) {
                System.out.print("Некорректный ввод. Введите целое число: ");
                scanner.next();
            }
            list2.add(scanner.nextInt());
        }

        ArrayList<Integer> mergedList = ListUnion.union(list1, list2);

        System.out.print("Объединенный список равен ");
        for (Integer num : mergedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}