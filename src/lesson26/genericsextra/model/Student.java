package lesson26.genericsextra.model;

import lesson26.genericsextra.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable {

    private String name;
    private String course;
    private int yearStarted;
    private static int nextId = 1000;
    private int id;

    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(3)];
        yearStarted = random.nextInt(2018, 2023);
        this.id = nextId++;
    }

    @Override
    public String toString() {
        return "%-7s %-15s %-15s %d".formatted(id, name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {

        String fName = fieldName.toUpperCase();
        return switch ((fName)) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            case "ID" -> id == (Integer.parseInt(value));
            default -> false;
        };
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
