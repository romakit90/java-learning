package lesson20.arraylistchallange;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        startProgram();

    }

    public static void startProgram() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> grocery = new ArrayList<>();
        System.out.println("List console is running");

        boolean test = true;
        while (test) {

            System.out.println("""
                    Type 1 to start adding item(s) to list
                    Type 2 to start removing item(s) from list
                    Type 0 to shutdown console
                    """);
            try {
                int number = scanner.nextInt();
                if (number == 0) {
                    System.out.println("End of session");
                    test = false;
                } else if (number == 1) {
                    System.out.println("Enter (comma delimited list) item(s) to add");
                    scanner.nextLine();
                    String[] parts = scanner.nextLine().split(",");
                    for (String item : parts) {
                        if (grocery.contains(item.trim())) {
                            System.out.println("One of items already exist in list");
                        } else {
                            grocery.add(item.trim());
                        }
                    }
                    grocery.sort(Comparator.naturalOrder());
                    System.out.println(grocery);

                    // add items
                } else if (number == 2) {
                    System.out.println("Enter (comma delimited list) item(s) to remove");
                    scanner.nextLine();
                    String[] parts = scanner.nextLine().split(",");
                    for (String item : parts) {
                        grocery.remove(item.trim());
                    }
                    grocery.sort(Comparator.naturalOrder());
                    System.out.println(grocery);

                    // remove items
                } else {
                    System.out.println("Invalid option");

                }

            } catch (InputMismatchException e) {
                System.out.println("Please, enter a valid number");
                scanner.nextLine();
            }
        }

    }
}
