import java.util.ArrayList;

public class SumCalculator {

    public static double sum(ArrayList<Double> list) {
        double total = 0;
        for (double value : list) {
            total += value;
        }
        return total;
    }
}