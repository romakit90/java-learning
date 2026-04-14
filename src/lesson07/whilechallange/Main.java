package lesson07.whilechallange;

public class Main {

    public static void main(String[] args) {

        int evenNumbers = 0;
        int oddNumber = 0;
        int i = 5;
        while (i <= 20) {
            if (isEvenNumber(i)) {
                evenNumbers++;
                System.out.println(i);
            } else {
                oddNumber++;
            }
            if (evenNumbers == 5) {
                break;
            }
            i++;

        }

        System.out.println("Total even numbers found: " + evenNumbers);
        System.out.println("Total odd numbers found: " + oddNumber);




    }

    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;
    }
}
