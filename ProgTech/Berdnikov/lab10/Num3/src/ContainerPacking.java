import java.util.ArrayList;
import java.util.Scanner;

public class ContainerPacking {

    private static class Container {
        private double remainingCapacity = 10.0;
        private final ArrayList<Double> items = new ArrayList<>();

        public boolean addItem(double weight) {
            if (weight <= 0 || weight > remainingCapacity) {
                return false;
            }
            items.add(weight);
            remainingCapacity -= weight;
            return true;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Double item : items) {
                sb.append(item).append(" ");
            }
            return sb.toString().trim();
        }
    }

    // Метод упаковки
    public static void packItems(ArrayList<Double> weights) {
        ArrayList<Container> containers = new ArrayList<>();

        for (double weight : weights) {
            boolean packed = false;
            for (Container container : containers) {
                if (container.addItem(weight)) {
                    packed = true;
                    break;
                }
            }
            if (!packed) {
                Container newContainer = new Container();
                newContainer.addItem(weight);
                containers.add(newContainer);
            }
        }

        System.out.println("Результат упаковки:");
        for (int i = 0; i < containers.size(); i++) {
            System.out.println("Контейнер " + (i + 1) + " содержит предметы с весом " + containers.get(i));
        }
        System.out.println("Всего контейнеров: " + containers.size());
    }

    // Тестовая часть
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество предметов: ");
        int n = scanner.nextInt();

        System.out.print("Введите веса предметов одной строкой через пробел: ");
        scanner.nextLine(); // Очистка буфера
        String inputLine = scanner.nextLine();

        // Преобразуем строку во временный ArrayList<Character>
        ArrayList<Character> charList = CharacterArrayConverter.toCharacterArray(inputLine);

        // Парсим строку в список весов
        ArrayList<Double> weights = new ArrayList<>();
        StringBuilder numberBuilder = new StringBuilder();

        for (char c : charList) {
            if (Character.isDigit(c) || c == '.') {
                numberBuilder.append(c);
            } else if (c == ' ' && !numberBuilder.isEmpty()) {
                try {
                    double value = Double.parseDouble(numberBuilder.toString());
                    if (value > 10) {
                        System.out.println("Предмет весом " + value + " кг не может быть упакован (вес > 10)");
                    } else {
                        weights.add(value);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Некорректное число: " + numberBuilder.toString());
                }
                numberBuilder.setLength(0); // Очистка
            }
        }

        // Добавляем последнее число, если осталось
        if (!numberBuilder.isEmpty()) {
            try {
                double value = Double.parseDouble(numberBuilder.toString());
                if (value > 10) {
                    System.out.println("Предмет весом " + value + " кг не может быть упакован (вес > 10)");
                } else {
                    weights.add(value);
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректное число: " + numberBuilder.toString());
            }
        }

        // Проверяем, что количество совпадает
        if (weights.size() != n) {
            System.out.println("Ошибка: количество введенных предметов не соответствует заявленному.");
            return;
        }

        // Вызов алгоритма упаковки
        packItems(weights);
    }
}