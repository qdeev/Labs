import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        long[] timeValues = {10000, 100000, 1000000, 10000000, 100000000,
                1000000000, 10000000000L, 100000000000L};

        for (long time : timeValues) {
            Date date = new Date(time);
            System.out.println("Время: " + time + " мс -> " + date.toString());
        }
    }
}
