import java.util.ArrayList;

public class MaxValueFinder {

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Integer maxValue = list.get(0);

        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        return maxValue;
    }
}