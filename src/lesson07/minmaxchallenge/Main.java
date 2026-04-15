package lesson07.minmaxchallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean hasValidInput = false;
        int minNumber = 0;
        int maxNumber = 0;


        while (true) {
            try {
                System.out.println("Enter a number: ");
                int firstNumber = Integer.parseInt(scanner.nextLine());

                if (!hasValidInput) {
                    minNumber = firstNumber;
                    maxNumber = firstNumber;
                    hasValidInput = true;
                } else {
                    if (firstNumber < minNumber) {
                        minNumber = firstNumber;
                    } else if (firstNumber > maxNumber) {
                        maxNumber = firstNumber;
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                break;
            }
        }

        if (hasValidInput) {
            System.out.println("Your min number was = " + minNumber + " and max number was " + maxNumber);
        } else {
            System.out.println("No valid numbers were entered.");
        }
    }
}
