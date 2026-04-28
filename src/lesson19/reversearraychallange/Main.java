package lesson19.reversearraychallange;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] testArray1 = {3, 5, 7, 2, 4, 23};
        System.out.println(Arrays.toString(testArray1));
        reverse(testArray1);
        System.out.println(Arrays.toString(testArray1));


    }

    private static void reverse(int[] array) {


        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for(int i = 0; i < array.length; i++) {
            array[i] = arrayCopy[array.length - (i +1)];
        }



    }
}
