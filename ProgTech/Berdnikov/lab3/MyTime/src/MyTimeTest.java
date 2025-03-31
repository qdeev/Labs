public class MyTimeTest {
    public static void main(String[] args) {
        MyTime time1 = new MyTime();
        MyTime time2 = new MyTime(555550000);
        MyTime time3 = new MyTime(5, 23, 55);

        System.out.println("Текущее время: " + time1.toString());
        System.out.println("Время через 555550000 мс: " + time2.toString());
        System.out.println("Время 5:23:55: " + time3.toString());
    }
}