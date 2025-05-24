import java.util.ArrayList;

public class ListUnion {

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer num : list1) {
            result.add(num);
        }

        for (Integer num : list2) {
            result.add(num);
        }

        return result;
    }
}