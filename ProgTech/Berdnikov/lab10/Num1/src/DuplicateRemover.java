import java.util.ArrayList;

public class DuplicateRemover {

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> seen = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            if (!seen.contains(current)) {
                seen.add(current);
            } else {
                list.remove(i);
                i--;
            }
        }
    }
}