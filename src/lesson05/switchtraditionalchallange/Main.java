package lesson05.switchtraditionalchallange;

public class Main {

    public static void main(String[] args) {

        char letter = 'D';

        switch (letter) {
            case 'A':
                System.out.println(letter + " is Able");
                break;
            case 'B':
                System.out.println(letter + " is Baker");
                break;
            case 'C':
                System.out.println(letter + " is Charlie");
                break;
            case 'D':
                System.out.println(letter + " is Dog");
                break;
            case 'E':
                System.out.println(letter + " is Easy");
                break;
            default:
                System.out.println(letter + " is not found");
                break;
        }

    }
}
