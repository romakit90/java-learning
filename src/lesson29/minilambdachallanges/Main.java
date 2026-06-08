package lesson29.minilambdachallanges;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };


        Consumer<String> printWordsLambda = (sentence) -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printWords.accept("Let's split this up into an array");
        printWordsLambda.accept("Let's split this up into an array");


        Consumer<String> printWordsForEach = (sentence) -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printWordsForEach.accept("Let's split this up into an array");

        Consumer<String> printWordsConcise = (sentence) -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        printWordsConcise.accept("Let's split this up into an array");

        System.out.println("-------");

        Function<String, String> everySecondCharLambda = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondCharLambda.apply("1234567890"));

        System.out.println(everySecondCharacter(everySecondCharLambda, "1234567890"));

        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava2 = () -> {return "I love Java!";};
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }

    public static String everySecondCharacter(Function<String, String> func, String sentence) {

        return func.apply(sentence);

    }




}
