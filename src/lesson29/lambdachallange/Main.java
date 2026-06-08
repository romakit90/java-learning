package lesson29.lambdachallange;

import java.util.Arrays;
import java.util.Random;

public class Main {



    public static void main(String[] args) {

        String[] firstNames = {"Finn", "Anna","Liam", "Bob", "Mia", "Ben", "Emma", "Theo", "Kevin"};
        Random random = new Random();

        // use Arrays.setAll or List.replaceAll to change

        System.out.println(Arrays.toString(firstNames));
        System.out.println("-------");

        // Transform names to all uppercase.
        Arrays.setAll(firstNames, (s) -> firstNames[s].toUpperCase());
        System.out.println(Arrays.toString(firstNames));
        System.out.println("-------");

        // Add a randomly generated middle initial and include a period.
        Arrays.setAll(firstNames, (s) -> firstNames[s] + " " + (char)('A' + random.nextInt(26)) + ".");
        System.out.println(Arrays.toString(firstNames));
        System.out.println("-------");

        // Add a last name that is the reverse of the first name.
        Arrays.setAll(firstNames, (s) -> firstNames[s] + " " +  new StringBuilder(firstNames[s].split(" ")[0]).reverse());
        System.out.println(Arrays.toString(firstNames));
        System.out.println("-------");
    }
}
