package lesson04.overloadedchallenge;

public class Main {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int height) {
        return height * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return (feet * 12 + inches) * 2.54;
    }
}
