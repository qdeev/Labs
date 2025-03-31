public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        long totalMilliseconds = System.currentTimeMillis();
        setTime(totalMilliseconds);
    }

    public MyTime(long elapseTime) {
        setTime(elapseTime);
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long elapseTime) {
        int totalSeconds = (int) (elapseTime / 1000);
        this.second = totalSeconds % 60;
        int totalMinutes = totalSeconds / 60;
        this.minute = totalMinutes % 60;
        int totalHours = totalMinutes / 60;
        this.hour = totalHours % 24;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}