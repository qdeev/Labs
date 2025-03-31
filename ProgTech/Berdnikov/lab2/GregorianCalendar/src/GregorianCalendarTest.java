import java.util.GregorianCalendar;

public class GregorianCalendarTest {
    public static void main(String[] args) {
        GregorianCalendar currentCalendar = new GregorianCalendar();
        int currentYear = currentCalendar.get(GregorianCalendar.YEAR);
        int currentMonth = currentCalendar.get(GregorianCalendar.MONTH) + 1;
        int currentDay = currentCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Текущая дата:");
        System.out.println("Год: " + currentYear);
        System.out.println("Месяц: " + currentMonth);
        System.out.println("День: " + currentDay);

        long timeInMillis = 1234567898765L;
        GregorianCalendar customCalendar = new GregorianCalendar();
        customCalendar.setTimeInMillis(timeInMillis);

        int customYear = customCalendar.get(GregorianCalendar.YEAR);
        int customMonth = customCalendar.get(GregorianCalendar.MONTH) + 1;
        int customDay = customCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("\nДата для времени 1234567898765 мс:");
        System.out.println("Год: " + customYear);
        System.out.println("Месяц: " + customMonth);
        System.out.println("День: " + customDay);
    }
}