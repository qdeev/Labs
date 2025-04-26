import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomSplit {

    public static String[] split(String s, String regex) {
        if (s == null || regex == null) {
            throw new IllegalArgumentException();
        }

        List<String> result = new ArrayList<>();
        int lastIndex = 0;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();

            // Добавляем подстроку перед разделителем
            if (start != lastIndex) {
                result.add(s.substring(lastIndex, start));
            }

            // Добавляем сам разделитель
            result.add(s.substring(start, end));

            // Обновляем индекс последней обработанной позиции
            lastIndex = end;
        }

        // Добавляем оставшуюся часть строки после последнего разделителя
        if (lastIndex < s.length()) {
            result.add(s.substring(lastIndex));
        }

        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] result1 = split("ab#12#453", "#");
        for (String part : result1) {
            System.out.println(part);
        }

        System.out.println();

        String[] result2 = split("a?b?gf#e", "[?#]");
        for (String part : result2) {
            System.out.println(part);
        }
    }
}