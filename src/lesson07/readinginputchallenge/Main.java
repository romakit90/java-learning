package lesson07.readinginputchallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(getInputNumber(1));

    }

    public static String getInputNumber(int number) {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        for (int i = 1; i <= 5; i++) {
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.println("Enter number " + i);
                    sum += Double.parseDouble(scanner.nextLine());
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number");
                }
            }
        }

        System.out.println("Sum of your numbers = " + sum);
        return "";
    }


}
