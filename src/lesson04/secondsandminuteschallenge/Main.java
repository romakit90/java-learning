package lesson04.secondsandminuteschallenge;

public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 90));

    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int secondsLeft = seconds % 60;

        return getDurationString(minutes, secondsLeft);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int minutesLeft = minutes % 60;

        return hours + "h " + minutesLeft + "m " + seconds + "s";
    }
}
