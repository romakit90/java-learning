package lesson26.genericsextra;

import lesson26.genericsextra.model.LPAStudent;
import lesson26.genericsextra.model.Student;
import lesson26.genericsextra.util.QueryList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        int studentCount = 25;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new LPAStudent());
        }


        printMoreLists(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }

        printMoreLists(lpaStudents);

        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1, 2, 3)));



        var students2021 = QueryList.getMatches(students, "YearStarted", "2021");
        printMoreLists(students2021);

        System.out.println("-".repeat(30));

        printMoreLists(students);

        var percentMatch = QueryList.getMatches(students, "percent complete", "50.0");
        percentMatch.sort(Comparator.naturalOrder());
        printMoreLists(percentMatch);
        percentMatch.sort(Comparator.comparing(Student::getCourse));
        printMoreLists(percentMatch);

    }


    public static  void printMoreLists(List<? extends Student> stud) {


        for (var student : stud) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void testList(List<?> list) {
        for (var element : list) {
            if (element instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (element instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

//
}
