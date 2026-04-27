package lesson18.arraychallange;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] randomArray1 = getRandomArray(5);
        System.out.println(Arrays.toString(randomArray1));
        Arrays.sort(randomArray1);
        System.out.println(Arrays.toString(randomArray1));
        descendingArray(randomArray1);
        System.out.println(Arrays.toString(randomArray1));

        int[] randomArray2 = getRandomArray(9);
        System.out.println(Arrays.toString(randomArray2));
        descendingArray(randomArray2);
        System.out.println(Arrays.toString(randomArray2));

    }

    public static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }

    public static int[] descendingArray (int[] array1) {
        Arrays.sort(array1);
        int[] copyOfArray1 = Arrays.copyOf(array1, array1.length);
        int x = array1.length;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = copyOfArray1[copyOfArray1.length - (i + 1)];
        }
        return array1;
    }


}
