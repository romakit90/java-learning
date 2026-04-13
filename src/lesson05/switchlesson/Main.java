package lesson05.switchlesson;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        // Traditional switch statement
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }


        // Enhanced switch statement (introduced in Java 14)
        int switchValueTwo = 4;

        switch (switchValueTwo) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValueTwo);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        String month = "XYZ";
        String quarter = getQuarter(month);
        System.out.println(month + " is in the " + quarter);
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "January", "February", "March" -> { yield "1st quarter"; }
            case "April", "May", "June" -> "2nd quarter";
            case "July", "August", "September" -> "3rd quarter";
            case "October", "November", "December" -> "4th quarter";
            default -> {
                String badResponse = month + " is not a valid month";
                yield badResponse;
            }
        };
    }
}
