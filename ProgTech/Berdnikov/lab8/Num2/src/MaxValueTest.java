import java.util.ArrayList;
import java.util.Scanner;

public class MaxValueTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            list.add(number);
        }

        Integer maxValue = MaxValueFinder.max(list);

        if (maxValue == null) {
            System.out.println("Array is empty");
        } else {
            System.out.println("maxValue: " + maxValue);
        }

        scanner.close();
    }
}