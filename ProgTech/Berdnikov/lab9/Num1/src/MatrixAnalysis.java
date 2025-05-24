import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        System.out.println("Матрица со случайными значениями равна:");
        printMatrix(matrix);

        List<Integer> maxRowIndices = findMaxRows(matrix);
        System.out.print("Индекс(ы) строчки с наибольшим кол-вом единиц: ");
        printList(maxRowIndices);

        List<Integer> maxColumnIndices = findMaxColumns(matrix);
        System.out.print("Индекс(ы) столбца с наибольшим кол-вом единиц: ");
        printList(maxColumnIndices);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static List<Integer> findMaxRows(int[][] matrix) {
        int maxOnesInRow = 0;
        List<Integer> maxRowIndices = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnesInRow) {
                maxOnesInRow = onesCount;
                maxRowIndices.clear();
                maxRowIndices.add(i);
            } else if (onesCount == maxOnesInRow) {
                maxRowIndices.add(i);
            }
        }
        return maxRowIndices;
    }

    public static List<Integer> findMaxColumns(int[][] matrix) {
        int maxOnesInColumn = 0;
        List<Integer> maxColumnIndices = new ArrayList<>();

        for (int j = 0; j < matrix[0].length; j++) {
            int onesCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnesInColumn) {
                maxOnesInColumn = onesCount;
                maxColumnIndices.clear();
                maxColumnIndices.add(j);
            } else if (onesCount == maxOnesInColumn) {
                maxColumnIndices.add(j);
            }
        }
        return maxColumnIndices;
    }

    public static void printList(List<Integer> indices) {
        if (indices.isEmpty()) {
            System.out.println("Нет подходящих индексов");
        } else {
            System.out.print(indices.get(0));
            for (int i = 1; i < indices.size(); i++) {
                System.out.print(", " + indices.get(i));
            }
            System.out.println();
        }
    }
}