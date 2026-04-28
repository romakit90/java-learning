package lesson19.minimumelementchallange;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(readIntegers(3,3,4,5,1)));

        int[] testArray = readIntegers(32,11,78,-5,0);
        System.out.println(Arrays.toString(testArray));

        int testInt = findMin(testArray);
        System.out.println(testInt);

    }

    public static int[] readIntegers(int... listOfNumbers) {
        return listOfNumbers;
    }

    public static int findMin(int... array) {

        Arrays.sort(array);
        return array[0];
    }
}
