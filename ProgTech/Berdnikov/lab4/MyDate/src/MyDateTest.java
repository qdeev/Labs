public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();

        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("Дата 1:");
        System.out.println("Год: " + date1.getYear());
        System.out.println("Месяц: " + (date1.getMonth() + 1));
        System.out.println("День: " + date1.getDay());

        System.out.println("\nДата 2:");
        System.out.println("Год: " + date2.getYear());
        System.out.println("Месяц: " + (date2.getMonth() + 1));
        System.out.println("День: " + date2.getDay());

    }
}