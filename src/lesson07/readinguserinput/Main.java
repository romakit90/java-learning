package lesson07.readinguserinput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int currentYear = 2026;
//        String usersDateOfBirth = "1990";
//
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String usersAgeWithPartialYear = "35.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("The user says he's " + ageWithPartialYear);

        int currentYear = 2026;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What is your name? ");
        System.out.println("Hi " + name + ", nice to meet you!");

        String dateOfBirth = System.console().readLine("What year were you born ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old.";


    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, What is your name? ");
        System.out.println("Hi, What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", nice to meet you!");

//        String dateOfBirth = System.console().readLine("What year were you born ");
        System.out.println("What year were you born ");
        String dateOfBirth = scanner.nextLine();

        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old.";
    }
}
